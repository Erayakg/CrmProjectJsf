/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Contact;
import java.util.List;

/**
 *
 * @author furka
 */
public class ContactDaoImpl extends AbstractDao implements DaoOperation<Contact> {
    
    @Override
    public void createTable(Contact t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(Contact t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Contact t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<Contact> getList( ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Contact getByid(Contact t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
