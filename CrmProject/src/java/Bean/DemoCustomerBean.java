/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
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
@Named
@SessionScoped
public class DemoCustomerBean implements BaseBean<demoCustomer>{

    private static final long serialVersionUID = 1L;

    private demoCustomer customer;

    private DemoCustomerDao customerdaoimpl;
  
    
    public DemoCustomerBean() {
    }

    
    
    public DemoCustomerDao getDaoCustomer(){
        if (this.customerdaoimpl==null) {
            this.customerdaoimpl=new DemoCustomerDao();
        }
        return customerdaoimpl;
    }

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
        getDaoCustomer().saveJpa(this.customer);
       
    }

    public void deleteUser() {
        getDaoCustomer().getByid(customer, customer.getId());
        customer = new demoCustomer();

    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}