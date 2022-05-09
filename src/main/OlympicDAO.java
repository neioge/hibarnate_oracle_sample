package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAOについての記述。必要に応じて、DatabaseManagerクラスをオブジェクト化して使用する。

public class OlympicDAO {

    private PreparedStatement pstmt;    // データベースに送信するSQLを格納するためのオブジェクト。
    private ResultSet resultSet;    // データベースから取得した、オブジェクトになる前の生の結果を格納するオブジェクト。

    // 入力Totalから結果を主とするためのメソッド。
    public List<Olympic> getCountryFromTotal(int TOTAL){
        List<Olympic> results = new ArrayList<Olympic>();   // メソッドの結果を返すリスト。

        try {
            Connection con = DatabaseManager.getConnection();   // データベースマネージャー、つまりデータベースにアクセスするためのオブジェクト。アクセスするデータベース名やパスワードなどを情報として持つ。

            String sql = "SELECT * FROM Sys.tokyo_olympics_2021 WHERE TOTAL >= ?";
            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, TOTAL);
            resultSet = pstmt.executeQuery();

            while(resultSet.next()){
                Olympic olympic = new Olympic();
                olympic.setID(resultSet.getInt("ID"));
                olympic.setRANK(resultSet.getInt("RANK"));
                olympic.setTEAM(resultSet.getString("TEAM"));
                olympic.setGOLDMEDAL(resultSet.getInt("GOLDMEDAL"));
                olympic.setSILVERMEDAL(resultSet.getInt("SILVERMEDAL"));
                olympic.setBRONZEMEDAL(resultSet.getInt("BRONZEMEDAL"));
                olympic.setTOTAL(resultSet.getInt("TOTAL"));
                olympic.setRANKBYTOTAL(resultSet.getInt("RANKBYTOTAL"));
                olympic.setNOCCODE(resultSet.getString("NOCCODE"));

                results.add(olympic);   //  問い合わせ結果をオブジェクトにしたので、ひとつづつ配列に代入する。
            }
        } catch (ClassNotFoundException e) {
            System.out.println("多分データベースの接続に失敗しました。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("多分SQLで失敗しました。");
            e.printStackTrace();
        } finally{
            if (resultSet != null){
                try {
                    resultSet.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            DatabaseManager.close();
        }

        return results;
    }

}
