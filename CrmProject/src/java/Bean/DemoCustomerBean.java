/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
import Dao.DemoCustomerDao;
import entity.demoCustomer;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author erayb
 */
@Named
@ViewScoped
public class DemoCustomerBean implements BaseBean<demoCustomer>{

    private static final long serialVersionUID = 1L;

    private demoCustomer customer;
    @EJB
    private DemoCustomerDao customerDao;
  


    public demoCustomer getCustomer() {
        if (this.customer==null) {
            this.customer=new demoCustomer();
        }
        return customer;
    }

    public void setCustomer(demoCustomer customer) {
        this.customer = customer;
    }

    public void saveUser() {
       customerDao.create(customer);
    }
    public  void login(){
         if (customer.getName().equals("baran") && customer.getPassword().equals("123")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("customer", customer);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("kulanıcı adı ve sifre yanlis"));
        }
         
    }

    @Override
    public void delete(Long id) {
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

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}