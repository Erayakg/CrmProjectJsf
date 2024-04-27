/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import Dao.CustomerDaoImpl;
import entity.Customer;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author gbara
 */
@Named(value = "CustomerBean")
@SessionScoped
public class CustomerBean implements Serializable {

    private static final long serialVersionUID = 1L;
        
    private Customer customer;
    
    private CustomerDaoImpl customerdaoimpl;
 
    
    public CustomerBean(){
        customer=new Customer();
        customerdaoimpl=new CustomerDaoImpl();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveUser() {
        
        customerdaoimpl.create(customer);

        customer=new Customer();
    }
    
    
    
    
}
