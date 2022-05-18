// ################################################################################################################################################################################
// DAOについての記述。必要に応じて、DatabaseManagerクラスをオブジェクト化して使用する。
// DAO:オブジェクト指向プログラミングでよく用いられる典型的なオブジェクトの設計パターン（デザインパターン）の一つで、データベースなどに保存しておくためのシステムや仕組みに対する操作を実装したオブジェクトのこと。
// ################################################################################################################################################################################

package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OlympicDAO {

    private static final String PERSISTENCE_UNIT_NAME = "hibarnate_oracle_sample";
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }

        return emf;
    }
}
