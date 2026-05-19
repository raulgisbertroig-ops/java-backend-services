package persistencia;

import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {
    
    private static final String PERSISTENCE_UNIT_NAME = "miUnidadDePersistencia";
    private static EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}