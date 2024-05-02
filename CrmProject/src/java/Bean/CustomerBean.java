/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import Dao.CustomerDaoImpl;
import entity.demoCustomer;
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
public class CustomerBean  implements Serializable {

    private static final long serialVersionUID = 1L;
        
    private demoCustomer customer;
    
    private CustomerDaoImpl customerdaoimpl;
 
    
    public CustomerBean(){
        customer=new demoCustomer();
        customerdaoimpl=new CustomerDaoImpl();
    }

    public demoCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(demoCustomer customer) {
        this.customer = customer;
    }

    public void saveUser() {
        
        //customerdaoimpl.create(customer);
        
       customerdaoimpl.getByid(customer,customer.getId());
    }
 
    public  void  deleteUser(){
        customerdaoimpl.getByid(customer, customer.getId());   
        customer=new demoCustomer();

    }
    
    
    
    
}
