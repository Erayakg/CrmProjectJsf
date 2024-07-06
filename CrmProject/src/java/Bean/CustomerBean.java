/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
import Dao.CustomerDaoImpl;
import Dao.DemoCustomerDao;
import UserSession.UserSession;
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
public class CustomerBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Customer customer;
    
    @EJB
    private CustomerDaoImpl customerDao;

   

    

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }


    public Customer getCustomer() {
        if (this.customer == null) {
            this.customer = new Customer();
        }
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveUser() {
        customerDao.create(this.getCustomer());
    }

    public void login() {
        if (this.customer.getMail().equals("baran@gmail.com") && this.customer.getPassword().equals("123")) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Login successful!"));

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Incorrect username or password"));

        }
    }
    public void delete(Long id) {
        this.customerDao.remove(this.getCustomer());
    }

    public Customer getById() {
        return this.customerDao.find(getCustomer().getId());
    }

    public List<Customer> getList() {
        return this.customerDao.findAll();
    }
}