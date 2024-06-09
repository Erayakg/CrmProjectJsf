
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
    
    private EmployeeDaoImpl employeeDaoImpl;
    
    public Employee getEmployee() {
        if(employee==null)
            employee=new Employee();
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDaoImpl getEmployeeDaoImpl() {
        if(employeeDaoImpl==null)
            employeeDaoImpl=new EmployeeDaoImpl();
        return employeeDaoImpl;
    }

    public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void saveUser() {
       this.getEmployeeDaoImpl().create(this.getEmployee());
    }
    
    @Override
    public void delete(Long id) {
        
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Employee> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
