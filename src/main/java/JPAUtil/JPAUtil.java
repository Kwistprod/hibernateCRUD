package JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory emf;
    static {
        emf = Persistence.createEntityManagerFactory("TEST");
    }
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    public static void close(){
        getEntityManager().close();
        emf.close();
    }
}
