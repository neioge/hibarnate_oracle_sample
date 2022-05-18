package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Olympicクラスにアクセスするため、CountryDAOをインスタンス化
        OlympicDAO dao = new OlympicDAO();

        // 検索用キーワードを入力
        System.out.print("検索キーワードを入力してください > ");
        int total = Integer.parseInt(keyIn());

        // 入力された値を引数に指定し、検索処理を実行し、Listオブジェクトを取得
        List<Olympic> list = dao.getCountryFromTotal(total);

        // 取得したListオブジェクトを順番に取り出し、出力
        for(Olympic item : list){
            System.out.println(item.getNOCCODE());
        }
    }

    /*
    * キーボードから入力された値をStringで返す 引数：なし 戻り値：入力された文字列
    */
    private static String keyIn() {
        String line = null;
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            line = key.readLine();
        } catch (IOException e) {
            System.out.println("入力を受け取るためのBufferedReaderのオブジェクト化に失敗した可能性があります。");
            e.fillInStackTrace();
        }
        return line;
    }

}
