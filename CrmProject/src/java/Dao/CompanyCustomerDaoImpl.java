/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import static Dao.ProductDaoImpl.mapToObject;
import entity.CompanyCustomer;
import entity.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author furka
 */
public class CompanyCustomerDaoImpl extends AbstractDao implements DaoOperation<CompanyCustomer> {

    

    @Override
    public void createTable(CompanyCustomer t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(CompanyCustomer t) {
        try {

            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(CompanyCustomer t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<CompanyCustomer> getList() {
        List<CompanyCustomer> CompanyCustomerList = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new CompanyCustomer());

            for (Object[] row : table) {
                CompanyCustomerList.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CompanyCustomerList;
    }

    public static CompanyCustomer mapToObject(Object[] row) {
        CompanyCustomer customer = new CompanyCustomer();
        customer.setId(((Number) row[0]).longValue());
        customer.setPhone((String) row[1]);
        customer.setAddress((String) row[2]);
        customer.setMail((String) row[3]);
        customer.setPassword((String) row[4]);
        customer.setCompanyName((String) row[5]);
        return customer;
    }

    @Override
    public CompanyCustomer getByid(CompanyCustomer t, Long id) {
        Object returnObjectById = null;
        try {
            returnObjectById = super.returnObjectById(t, id);
        } catch (SQLException ex) {
            Logger.getLogger(CompanyCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (CompanyCustomer) returnObjectById;
    }

    @Override
    public void update(CompanyCustomer t, Long id) {
        try {
            super.updateDao(t, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CompanyCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
  
}
