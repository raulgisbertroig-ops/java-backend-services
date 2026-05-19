package persistencia;

import modelo.Desarrollador;
import java.util.List;
import javax.persistence.EntityManager;

public class DesarrolladorDAO {

    public void crear(Desarrollador d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(d); // ObjectDB guarda el objeto directamente
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Desarrollador> obtenerTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            // JPQL: Pedimos los datos a la BD, no los filtramos en Java
            return em.createQuery("SELECT d FROM Desarrollador d", Desarrollador.class).getResultList();
        } finally {
            em.close();
        }
    }

public void eliminar(String nombre) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        em.getTransaction().begin();
        // Buscamos los desarrolladores con ese nombre usando JPQL
        List<Desarrollador> aEliminar = em.createQuery("SELECT d FROM Desarrollador d WHERE d.nombre = :n", Desarrollador.class)
                                         .setParameter("n", nombre)
                                         .getResultList();
        
        for (Desarrollador d : aEliminar) {
            em.remove(d); // Marcamos para eliminar
        }
        em.getTransaction().commit();
    } catch (Exception e) {
        if (em.getTransaction().isActive()) em.getTransaction().rollback();
        e.printStackTrace(); 
    } finally {
        em.close();
    }
}

}

