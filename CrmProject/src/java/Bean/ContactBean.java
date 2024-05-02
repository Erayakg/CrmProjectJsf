/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ContactDaoImpl;
import entity.Contact;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named(value = "ContactBean")
@SessionScoped
public class ContactBean implements BaseBean<Object> {

    /*  private Contact contact;

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

    public ContactDaoImpl getCampaingDaoImpl() {
        if (this.contactDaoImpl == null) {
            contactDaoImpl = new ContactDaoImpl();
        }
        return contactDaoImpl;
    }

    public void setCampaingDaoImpl(ContactDaoImpl contactDaoImpl) {
        this.contactDaoImpl = contactDaoImpl;
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
    public void delete() {
        this.contactDaoImpl.deleteById(this.getContact(), getContact().getId());
    }

    @Override
    public Object getById() {
        return this.contactDaoImpl.getByid(this.getContact(), getContact().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
