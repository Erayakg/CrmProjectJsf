/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Invoice;
import entity.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author furka
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

    public List<Invoice> getInvoiceListByProductId(Long productId) {
        return em.createQuery("SELECT p.invoice FROM Product p WHERE p.id = :productId", Invoice.class)
                 .setParameter("productId", productId)
                 .getResultList();
    }
}
