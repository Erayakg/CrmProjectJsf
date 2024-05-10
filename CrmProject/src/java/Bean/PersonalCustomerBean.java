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
@Named
@SessionScoped
public class PersonalCustomerBean implements BaseBean<PersonalCustomer> {

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

    public PersonalCustomerDaoImpl personalcustomerDaoImpl() {
        if (this.personalcustomerDaoImpl == null) {
            personalcustomerDaoImpl = new PersonalCustomerDaoImpl();
        }
        return personalcustomerDaoImpl;
    }

    public void setCampaingDaoImpl(PersonalCustomerDaoImpl personalcustomerDaoImpl) {
        this.personalcustomerDaoImpl = personalcustomerDaoImpl;
    }

    public PersonalCustomerBean() {
        this.personalcustomerDaoImpl=new PersonalCustomerDaoImpl();

    }

    public PersonalCustomerBean(PersonalCustomer personalcustomer, PersonalCustomerDaoImpl personalcustomerDaoImpl) {
        this.personalcustomer = personalcustomer;
        this.personalcustomerDaoImpl = personalcustomerDaoImpl;
    }

    @Override
    public void save() {
        this.personalcustomerDaoImpl.createTable(this.getPersonalCustomer());
        this.personalcustomerDaoImpl.create(this.getPersonalCustomer());
    }

    @Override
    public void delete(Long id) {
        this.personalcustomerDaoImpl.deleteById(this.getPersonalCustomer(), getPersonalCustomer().getId());
    }

    @Override
    public PersonalCustomer getById() {
        return this.personalcustomerDaoImpl.getByid(this.getPersonalCustomer(), getPersonalCustomer().getId());
    }

    @Override
    public List<PersonalCustomer> getList() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
