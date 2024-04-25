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

/**
 *
 * @author gbara
 */
@Named(value="CustomerBean")
@SessionScoped
public class CustomerBean implements Serializable {

    private Customer customer;
    private CustomerDaoImpl customerdao;
    public CustomerBean(){
        customer=new Customer();
        customerdao=new CustomerDaoImpl();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerDaoImpl getCustomerdao() {
        return customerdao;
    }

    public void setCustomerdao(CustomerDaoImpl customerdao) {
        this.customerdao = customerdao;
    }
    
    public void saveUser() {
        customerdao.create(customer);
        customer=new Customer();
    }
    
}
