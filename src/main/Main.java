package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        // EntityManagerのオブジェクトを生成
        EntityManager em = OlympicDAO.createEntityManager();

        // 1件取得して名前を表示する
        Olympic olympic = em.find(Olympic.class, 1);
        System.out.println(olympic.getTEAM());

        // EntityManagerの利用を終了する
        em.close();
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
