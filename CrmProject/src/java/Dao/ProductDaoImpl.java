/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Document;
import entity.Invoice;
import entity.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import util.Connector;

/**
 *
 * @author furka
 */
@Stateless
public class ProductDaoImpl extends AbstractDao<Product> {

    private Connector connector;
    private Connection connection;

    @PersistenceContext(unitName = "CrmProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductDaoImpl() {
        super(Product.class);
    }

    public Product insertDocument(Product p) {
        em.persist(p);
        em.flush();
        return p;
    }

    public Long insert(Product d) {
        long generatedId = -1;
        int affectedRows;
        String query = "insert into product(name,description,price,isActive,filename,filepath,filetype) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = this.getConnection().prepareStatement(
                    query, PreparedStatement.RETURN_GENERATED_KEYS); 
            pst.setString(1, d.getName());
            pst.setString(2, d.getDescription());
            pst.setInt(3, (int) d.getPrice());
            pst.setBoolean(4, d.isIsActive());
            pst.setString(5, d.getFileName());
            pst.setString(6, d.getFilePath());
            pst.setString(7, d.getFileType());
            affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    generatedId = rs.getLong(1);
                }
                rs.close();
            }
            pst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return generatedId;
    }

    public Connector getConnector() {
        if (this.connector == null) {
            this.connector = new Connector();
        }
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getConnector().connect();
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Invoice> getInvoiceListByProductId(Long productId) {
        return em.createQuery("SELECT p.invoice FROM Product p WHERE p.id = :productId", Invoice.class)
                .setParameter("productId", productId)
                .getResultList();
    }
}
