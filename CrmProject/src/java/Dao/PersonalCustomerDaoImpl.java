/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.PersonalCustomer;
import java.util.List;

/**
 *
 * @author furka
 */
public class PersonalCustomerDaoImpl extends AbstractDao implements DaoOperation<PersonalCustomer> {
    
    @Override
    public void createTable(PersonalCustomer t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(PersonalCustomer t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(PersonalCustomer t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<PersonalCustomer> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public PersonalCustomer getByid(PersonalCustomer t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
