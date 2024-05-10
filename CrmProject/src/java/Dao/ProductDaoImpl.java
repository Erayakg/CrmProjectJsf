/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Order;
import entity.Product;
import java.util.List;
import java.sql.*;

/**
 *
 * @author furka
 */
public class ProductDaoImpl extends AbstractDao implements DaoOperation<Product> {
    
    @Override
    public void createTable(Product t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(Product t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Product t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<Product> getList( ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Product getByid(Product t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void addProductToCampaign(Order order, Product product) {
    
    String sql = "INSERT INTO Campaign_Product (campaign_id, product_id) VALUES (?, ?)";
    
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setLong(1, order.getId());
        statement.setLong(2, product.getId());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new product added to the campaign successfully!");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }
    
    
    

    
}
