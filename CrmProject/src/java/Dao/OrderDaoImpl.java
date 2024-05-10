/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import com.sun.istack.logging.Logger;
import entity.Orders;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

/**
 *
 * @author furka
 */
public class OrderDaoImpl extends AbstractDao implements DaoOperation<Orders> {
    
    @Override
    public void createTable(Orders t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(Orders t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Orders t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<Orders> getList( ) {
                List<Orders> productList = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Orders());

            for (Object[] row : table) {
                productList.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            System.out.println("error"+ex);
        }
        return productList;
    }
     private Orders mapToObject(Object[] row) {
        long id = (long) row[0];
        LocalDateTime orderDate = (LocalDateTime) row[1];
        String shippingAddress = (String) row[2];
        float totalAmount = (float) row[3];
        boolean status = (boolean) row[4];
     
        return new Orders(id, orderDate, shippingAddress, totalAmount, status, null); 

     }
    
    @Override
    public Orders getByid(Orders t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
