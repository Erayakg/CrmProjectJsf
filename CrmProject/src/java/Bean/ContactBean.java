/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ContactDaoImpl;
import entity.Contact;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class ContactBean implements BaseBean<Contact> {

    private Contact contact;
    @EJB
    private ContactDaoImpl contactDaoImpl;

    public Contact getContact() {
        if (this.contact == null) {
            contact = new Contact();
        }
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }



    public ContactBean() {

    }

    public ContactBean(Contact contact, ContactDaoImpl contactDaoImpl) {
        this.contact = contact;
        this.contactDaoImpl = contactDaoImpl;
    }

    @Override
    public void save() {

        this.contactDaoImpl.create(this.getContact());
    }

    @Override
    public void delete(Long id) {
        this.contactDaoImpl.remove(this.getContact());
    }

    @Override
    public Contact getById() {
        return this.contactDaoImpl.find(getContact().getId());
    }

    @Override
    public List<Contact> getList() {
       return this.contactDaoImpl.findAll();
    }
}
