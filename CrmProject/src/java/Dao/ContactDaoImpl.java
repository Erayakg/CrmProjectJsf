/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Contact;
import java.util.List;

/**
 *
 * @author baran
 */
public class ContactDaoImpl extends AbstractDao<Contact> implements DaoOperation<Contact> {

    public ContactDaoImpl() {
        super(Contact.class);
    }

    @Override
    public void create(Contact contact) {
        try {
            super.saveJpa(contact);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Contact> getList() {
        return super.findAll();
    }

    @Override
    public Contact getByid(Long id) {
        return super.find(id);
    }

}
