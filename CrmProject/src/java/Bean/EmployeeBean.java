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
@Named(value = "EmployeeBean")
@SessionScoped
public class EmployeeBean implements BaseBean<Object> {

    private Employee employee;
    private EmployeeDaoImpl employeeDaoImpl;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDaoImpl getEmployeeDaoImpl() {
        return employeeDaoImpl;
    }

    public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @Override
    public void save() {
        this.getEmployeeDaoImpl().create(getEmployee());

    }

    @Override
    public void delete() {
        this.getEmployeeDaoImpl().deleteById(this.getEmployee(), this.getEmployee().getId());
    }

    @Override
    public Object getById() {
        return this.getEmployeeDaoImpl().getByid(getEmployee(), this.getEmployee().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
