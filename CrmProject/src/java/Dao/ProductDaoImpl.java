/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Order;
import entity.Product;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Product t, Long id) {
        super.delete(t, id);
    }
    
   @Override
    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Product());

            for (Object[] row : table) {
                productList.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }
    
    
   public static Product mapToObject(Object[] row) {
    Product product = new Product();
    product.setId(((Number)row[0]).longValue()); 
    product.setName((String) row[1]); 
    product.setDescription((String) row[2]); 
    product.setPrice(((Number)row[3]).floatValue()); 
    product.setStockQuantity((Integer) row[4]); 
  
    product.setIsActive((Boolean) row[6]); 
    return product;
}

    @Override
    public Product getByid(Product t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void addProductToCampaign(Order order, Product product) {
    
    String sql = "INSERT INTO ORDER_Product (order_id, product_id) VALUES (?, ?)";
    
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
