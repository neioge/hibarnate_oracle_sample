package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// このクラスはDAOではなく、DAOのうちデータベースにアクセスするConnectionクラスに関する記述を外に出しただけ。

public class DatabaseManager {
    private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       con = DriverManager.getConnection("jdbc:oracle:thin:neioge/iloveNana0807@//localhost:1521/orclpdb");
       return con;
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
