/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.PersonalCustomer;
import java.util.List;

/**
 *
 * @author furka
 */
public class PersonalCustomerDaoImpl extends AbstractDao<PersonalCustomer> implements DaoOperation<PersonalCustomer> {

    public PersonalCustomerDaoImpl() {
        super(PersonalCustomer.class);
    }

    @Override
    public void create(PersonalCustomer personalCustomer) {
        try {
            super.saveJpa(personalCustomer);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<PersonalCustomer> getList() {
        return super.findAll();
    }

    @Override
    public PersonalCustomer getByid(Long id) {
        return super.find(id);
    }

}
