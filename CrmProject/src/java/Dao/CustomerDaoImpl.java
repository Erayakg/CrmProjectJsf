/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.demoCustomer;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author erayb
 */

public class CustomerDaoImpl extends AbstractDao implements DaoOperation<demoCustomer> {
   
 
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
     public List<demoCustomer> getList(demoCustomer t) {
         List<Object[]> tableData = super.returnTable(t);
         List<demoCustomer> customers = new ArrayList<>();

         tableData.forEach(row -> {
             
             demoCustomer customer = new demoCustomer();
             customer.setId((Long) row[0]); 
             customer.setName((String) row[1]); 
             customer.setSurname((String) row[2]);
             
             customers.add(customer);
         });

         return customers;
     }


    @Override
    public demoCustomer getByid(demoCustomer t, Long id) {
        
        Object returnObjectById = super.returnObjectById(t, id);
        
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
