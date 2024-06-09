
package Bean;

import Dao.CustomerDaoImpl;
import Dao.EmployeeDaoImpl;
import entity.Customer;
import entity.Employee;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;

import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author baran
 */
@Named
@ViewScoped
public class EmployeeBean implements BaseBean<Employee> {

    private static final long serialVersionUID = 1L;

    private Employee employee;
   
    @EJB
    private EmployeeDaoImpl employeeDaoImpl;
    
    public Employee getEmployee() {
        if(employee==null)
            employee=new Employee();
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

 

    @Override
    public void save() {
        this.employeeDaoImpl.create(this.getEmployee());
    }
    public void saveUser() {
       this.employeeDaoImpl.create(this.getEmployee());
    }
    
    @Override
    public void delete(Long id) {
        this.employeeDaoImpl.remove(this.getEmployee());
    }
    public  void login(){
         if (employee.getMail().equals("baran@gmail.com") && employee.getPassword().equals("123")) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("customer", employee);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("kullanıcı adı ve sifre yanlis"));
        }
        
    }

    @Override
    public Employee getById() {
        return this.employeeDaoImpl.find(getEmployee().getId());
    }

    @Override
    public List<Employee> getList() {
        return this.employeeDaoImpl.findAll();
    }

}
