
package UserSession;

import Bean.CustomerBean;
import Bean.EmployeeBean;
import jakarta.inject.Inject;
import Dao.CustomerDaoImpl;
import entity.Customer;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "userSession")
@SessionScoped
public class UserSession implements Serializable {
    
    @Inject
    private CustomerBean customerbean;
    
    @Inject
    private EmployeeBean employeebean;

    public CustomerBean getCustomerbean() {
        if(customerbean==null)
            customerbean=new CustomerBean();
        return customerbean;
    }

    public void setCustomerbean(CustomerBean customerbean) {
        this.customerbean = customerbean;
    }

    /*public Customer getCustomer() {
        if(customer==null)
            customer=new Customer();
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
*/
    public EmployeeBean getEmployeebean() {
        if(employeebean==null)
            employeebean=new EmployeeBean();
        return employeebean;
    }

    public void setEmployeebean(EmployeeBean employeebean) {
        this.employeebean = employeebean;
    }
    
    
    private boolean loggedIn;
    private String role; 

    public UserSession() {
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Simulate login methods
  public String loginAsCustomer() {
    this.loggedIn = true;
    this.role = "customer";
    Customer customer = this.getCustomerbean().getCustomer();

    if (customer.getMail().equals("baran@gmail.com") && customer.getPassword().equals("123")) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("customer", customer);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Login successful!"));
        return "/panel/homepage/homepage.xhtml?faces-redirect=true";
    } else {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Incorrect username or password"));
        return "";
    }
}


    public String loginAsEmployee() {
        this.loggedIn = true;
        this.role = "employee";
        if (this.getEmployeebean().getEmployee().getMail().equals("baran@gmail.com") && this.getEmployeebean().getEmployee().getPassword().equals("123")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("employee", this);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Login successful!"));
            return "/panel/homepage/homepage.xhtml?faces-redirect=true";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("kullanıcı adı ve sifre yanlis"));
            return "";
        }
        
    }

    public String logout() {
        this.loggedIn = false;
        this.role = null;
        return "/panel/homepage/homepage.xhtml?faces-redirect=true";
    }
}
