/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
import Dao.CustomerDaoImpl;
import Dao.DemoCustomerDao;
import entity.Customer;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CustomerBean implements BaseBean<Customer>{

    private static final long serialVersionUID = 1L;

    private Customer customer;
    
    private CustomerDaoImpl customerDao;
    
    public Customer getCustomer() {
        if (this.customer==null) {
            this.customer=new Customer();
        }
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveUser() {
       customerDao.create(customer);
       
    }
    public  void login(){
         if (customer.getMail().equals("baran@gmail.com") && customer.getPassword().equals("123")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("customer", customer);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("kulanıcı adı ve sifre yanlis"));
        }
        
    }
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}