/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.demoCustomer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erayb
 */
public class DemoCustomerDao extends AbstractDao implements DaoOperation<demoCustomer>{

    public DemoCustomerDao() {
    }
    
    
    @Override
    public void create(demoCustomer customer) {
       
        try {
            
            super.createEntity(customer);
        } catch (Exception ex) {
            System.out.println("error"+ex);
        }
    }
    
    @Override
    public void deleteById(demoCustomer t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<demoCustomer> getList() {
        List<Object[]> tableData = null;
        demoCustomer c = new demoCustomer();
        try {
            tableData = super.returnTable(c);
        } catch (SQLException ex) {
            Logger.getLogger(DemoCustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<demoCustomer> customers = new ArrayList<>();

        if (tableData != null) {
            for (Object[] row : tableData) {
                if (row.length >= 3 && row[0] instanceof Integer && row[1] instanceof String && row[2] instanceof String) {
                    demoCustomer customer = new demoCustomer();
                    customer.setId(((Integer) row[0]).longValue()); // Integer'ı Long'a dönüştürüyoruz
                    customer.setName((String) row[1]); 
                    customer.setSurname((String) row[2]);
                    System.out.println(customer.toString());
                    customers.add(customer);
                } 
            }
        }
        return customers;
    }
    
    @Override
    public demoCustomer getByid(demoCustomer t, Long id) {
        
        //Object returnObjectById = super.returnObjectById(t, id);
        
        return  null; 
       
    }

    @Override
    public void createTable(demoCustomer t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
                System.out.println("error"+ ex);

        }
    }

    
}
