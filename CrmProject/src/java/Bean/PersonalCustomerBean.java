/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.PersonalCustomerDaoImpl;
import entity.PersonalCustomer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named(value = "PersonalCustomerBean")
@SessionScoped
public class PersonalCustomerBean implements BaseBean<Object> {

    private PersonalCustomer personalcustomer;

    private PersonalCustomerDaoImpl personalcustomerDaoImpl;

    public PersonalCustomer getPersonalCustomer() {
        if (this.personalcustomer == null) {
            personalcustomer = new PersonalCustomer();
        }
        return personalcustomer;
    }

    public void setPersonalCustomer(PersonalCustomer personalcustomer) {
        this.personalcustomer = personalcustomer;
    }

    public PersonalCustomerDaoImpl getCampaingDaoImpl() {
        if (this.personalcustomerDaoImpl == null) {
            personalcustomerDaoImpl = new PersonalCustomerDaoImpl();
        }
        return personalcustomerDaoImpl;
    }

    public void setCampaingDaoImpl(PersonalCustomerDaoImpl personalcustomerDaoImpl) {
        this.personalcustomerDaoImpl = personalcustomerDaoImpl;
    }

    public PersonalCustomerBean() {

    }

    public PersonalCustomerBean(PersonalCustomer personalcustomer, PersonalCustomerDaoImpl personalcustomerDaoImpl) {
        this.personalcustomer = personalcustomer;
        this.personalcustomerDaoImpl = personalcustomerDaoImpl;
    }

    @Override
    public void save() {

        this.personalcustomerDaoImpl.create(this.getPersonalCustomer());
    }

    @Override
    public void delete() {
        this.personalcustomerDaoImpl.deleteById(this.getPersonalCustomer(), getPersonalCustomer().getId());
    }

    @Override
    public Object getById() {
        return this.personalcustomerDaoImpl.getByid(this.getPersonalCustomer(), getPersonalCustomer().getId());
    }

    @Override
    public List<Object> getList() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
