import entity.demoCustomer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DemoCustomerJpaDaoImpl  {

    private final EntityManagerFactory emf;

    public DemoCustomerJpaDaoImpl() {
        emf = Persistence.createEntityManagerFactory("customerPU");
    }

    public void saveCustomer(demoCustomer customer) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
    }
    
  
}
