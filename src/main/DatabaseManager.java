package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// このクラスはDAOではなく、DAOのうちデータベースにアクセスするConnectionクラスに関する記述を外に出しただけ。

public class DatabaseManager {
    private static Connection con;
    private static String token;
    private static String configFilePath = System.getProperty("user.dir") + "\\config\\pass.txt";

    public static void readConfig() throws IOException{
        try {
            File configFile = new File(configFilePath);
            FileReader configfr = new FileReader(configFile);
            BufferedReader configbr = new BufferedReader(configfr);
            DatabaseManager.token = configbr.readLine();
            configbr.close();
        } catch (FileNotFoundException e) {
            System.out.println("設定ファイルの読み込みに失敗しました。パスを間違えている可能性があります。");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("設定ファイルの読み込みに失敗しました。パスを間違えている可能性があります。");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
       try {
           DatabaseManager.readConfig();
       } catch (IOException e) {
           e.printStackTrace();
       }
       Class.forName("oracle.jdbc.driver.OracleDriver");
       con = DriverManager.getConnection("jdbc:oracle:thin:neioge/" + DatabaseManager.token + "@//localhost:1521/orclpdb");
       return con;
    }

    public static String getPassword(){
        return DatabaseManager.token;
    }

    public static void close(){
        if (con != null){
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("データベースの切断に失敗しました。");
                e.printStackTrace();
            }
        }
    }
}
