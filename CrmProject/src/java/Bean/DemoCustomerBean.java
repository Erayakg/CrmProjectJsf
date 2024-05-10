/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.CustomerDaoImpl;
import Dao.DemoCustomerDao;
import entity.demoCustomer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author erayb
 */
@Named(value = "demoCustomerBean")
@SessionScoped
public class DemoCustomerBean implements BaseBean<demoCustomer>{

    private static final long serialVersionUID = 1L;

    private demoCustomer customer;

    private DemoCustomerDao customerdaoimpl;

    public DemoCustomerBean(demoCustomer customer, DemoCustomerDao customerdaoimpl) {
        this.customer = customer;
        this.customerdaoimpl = customerdaoimpl;
    }

   

    public demoCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(demoCustomer customer) {
        this.customer = customer;
    }

    public void saveUser() {

        customerdaoimpl.create(customer);
        
        //customerdaoimpl.getByid(customer, customer.getId());
    }

    public void deleteUser() {
        customerdaoimpl.getByid(customer, customer.getId());
        customer = new demoCustomer();

    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public demoCustomer getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<demoCustomer> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}