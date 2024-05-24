/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.CompanyCustomer;
import entity.Employee;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baran
 */
public class EmployeeDaoImpl extends AbstractDao implements DaoOperation<Employee> {

    @Override
    public void update(Employee e, Long id) {
        try {
            super.updateDao(e, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void createTable(Employee t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(Employee t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Employee t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<Employee> getList() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Employee());

            for (Object[] row : table) {
                employeeList.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    }

    public static Employee mapToObject(Object[] row) {
        Employee employee = new Employee();
        employee.setId(((Number) row[0]).longValue());

        // Salary değerini doğru şekilde işleme
        double salary = 0.0;
        if (row[1] instanceof Number) {
            salary = ((Number) row[1]).doubleValue();
        } else if (row[1] instanceof String) {
            try {
                salary = Double.parseDouble((String) row[1]);
            } catch (NumberFormatException e) {
                System.err.println("Salary format hatası: " + row[1]);
            }
        }
        employee.setSalary(salary);

        employee.setName((String) row[2]);
        employee.setSurname((String) row[3]);
        employee.setPhone((String) row[4]);
        employee.setAddress((String) row[5]);
        employee.setMail((String) row[6]);

        return employee;
    }

    @Override
    public Employee getByid(Employee t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
