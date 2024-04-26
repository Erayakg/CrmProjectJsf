/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.SqlGenerator;
import entity.Customer;
import java.util.List;
import Util.DbConnect;
import jakarta.ejb.Stateless;

/**
 *
 * @author erayb
 */
public class CustomerDaoImpl extends AbstractDao implements DaoOperation<Customer>{

    public CustomerDaoImpl(SqlGenerator generator1) {
        super(generator1);
    }

 
    @Override
    public void create() {
        this.create();
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> getList(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer getByid(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    
}
