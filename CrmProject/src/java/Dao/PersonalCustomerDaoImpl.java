/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.PersonalCustomer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author furka
 */
public class PersonalCustomerDaoImpl extends AbstractDao implements DaoOperation<PersonalCustomer> {

    @Override
    public void createTable(PersonalCustomer t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(PersonalCustomer t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(PersonalCustomer t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<PersonalCustomer> getList() {
        List<PersonalCustomer> personalCustomerlist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new PersonalCustomer());

            for (Object[] row : table) {
                personalCustomerlist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return personalCustomerlist;
    }

    @Override
    public PersonalCustomer getByid(PersonalCustomer t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static PersonalCustomer mapToObject(Object[] row) {

        PersonalCustomer personalCustomer = new PersonalCustomer();
        personalCustomer.setId(((Number) row[0]).longValue());
        personalCustomer.setName((String) row[1]);
        personalCustomer.setSurname((String) row[2]);
        personalCustomer.setMail((String) row[3]);
        personalCustomer.setPhone((String) row[4]);
        personalCustomer.setAddress((String) row[5]);
        personalCustomer.setPassword((String) row[6]);
        return personalCustomer;
    }

    @Override
    public void update(Long id) {
        PersonalCustomer personalCustomer = new PersonalCustomer();
        personalCustomer = this.getByid(personalCustomer, id);
        try {
            super.update(personalCustomer, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PersonalCustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
