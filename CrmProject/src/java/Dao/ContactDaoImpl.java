/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Contact;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<Contact> getList() {
        List<Contact> contactlist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Contact());

            for (Object[] row : table) {
                contactlist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContactDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contactlist;
    }

    @Override
    public Contact getByid(Contact t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Contact mapToObject(Object[] row) {

        Contact contact = new Contact();
        contact.setId(((Number) row[0]).longValue());
        contact.setTitle((String) row[1]);
        contact.setDescription((String) row[2]);
        contact.setSubject((String) row[3]);
        return contact;
    }

    @Override
    public void update(Long id) {
        Contact contact = new Contact();
        contact = this.getByid(contact, id);
        try {
            super.update(contact, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ContactDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
