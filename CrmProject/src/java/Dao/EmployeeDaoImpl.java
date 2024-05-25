/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Employee;
import java.util.List;

/**
 *
 * @author baran
 */
public class EmployeeDaoImpl extends AbstractDao<Employee> implements DaoOperation<Employee> {

    public EmployeeDaoImpl() {
        super(Employee.class);
    }

    @Override
    public void create(Employee employee) {
        try {
            super.saveJpa(employee);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Employee> getList() {
        return super.findAll();
    }

    @Override
    public Employee getByid(Long id) {
        return super.find(id);
    }

}
