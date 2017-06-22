package secondTry.SQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATest");
        EntityManager em = emf.createEntityManager();
//        while (true){
//            int i=1;
//            if (i==0) break;
//        }
        em.close();
        emf.close();
    }
}
