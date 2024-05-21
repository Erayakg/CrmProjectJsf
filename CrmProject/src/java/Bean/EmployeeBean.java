/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.EmployeeDaoImpl;
import entity.Employee;
import jakarta.enterprise.context.SessionScoped;

import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author baran
 */
@Named
@SessionScoped
public class EmployeeBean implements BaseBean<Employee> {

    private Employee employee;
    private EmployeeDaoImpl employeeDaoImpl;

    public Employee getEmployee() {
        if(this.employee==null)
            employee=new Employee();
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDaoImpl getEmployeeDaoImpl() {
        if(this.employeeDaoImpl==null)
            employeeDaoImpl=new EmployeeDaoImpl();
        return employeeDaoImpl;
    }

    public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @Override
    public void save() {
        this.getEmployeeDaoImpl().createTable(getEmployee());
        this.getEmployeeDaoImpl().create(getEmployee());

    }

    @Override
    public void delete(Long id) {
        this.getEmployeeDaoImpl().deleteById(this.getEmployee(), this.getEmployee().getId());
    }

    @Override
    public Employee getById() {
        return this.getEmployeeDaoImpl().getByid(getEmployee(), this.getEmployee().getId());
    }

    @Override
    public List<Employee> getList() {
        return this.getEmployeeDaoImpl().getList();
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
