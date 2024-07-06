package Dao;

import entity.Invoice;
import entity.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 * DAO implementation for Product entity using JPA.
 */
@Stateless
public class ProductDaoImpl extends AbstractDao<Product> {

    @PersistenceContext(unitName = "CrmProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductDaoImpl() {
        super(Product.class);
    }

    public Product insertProduct(Product p) {
        em.persist(p);
        em.flush();
        return p;
    }

    public Long insert(Product p) {
        em.persist(p);
        em.flush();
        return p.getId();
    }

   
}
