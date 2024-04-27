/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Customer;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author erayb
 */

public class CustomerDaoImpl extends AbstractDao implements DaoOperation<Customer> {

 
    @Override
    public void create(Customer customer) {
       
        try {
            super.createEntity(customer);
        } catch (Exception ex) {
            System.out.println("error"+ex);
        }
    }

    @Override
    public void deleteById(Customer t, Long id) {
        super.delete(t, id);
    }

     @Override
     public List<Customer> getList(Customer t) {
         List<Object[]> tableData = super.returnTable(t);
         List<Customer> customers = new ArrayList<>();

         tableData.forEach(row -> {
             
             Customer customer = new Customer();
             customer.setId((Long) row[0]); 
             customer.setName((String) row[1]); 
             customer.setSurname((String) row[2]);
             
             customers.add(customer);
         });

         return customers;
     }


    @Override
    public Customer getByid(Customer t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
