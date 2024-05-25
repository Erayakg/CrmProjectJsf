/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Customer;
import java.util.List;

/**
 *
 * @author erayb
 */
public class CustomerDaoImpl extends AbstractDao<Customer> implements DaoOperation<Customer> {

    public CustomerDaoImpl() {
        super(Customer.class);
    }

    @Override
    public void create(Customer customer) {
        try {
            super.saveJpa(customer);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Customer> getList() {
        return super.findAll();
    }

    @Override
    public Customer getByid(Long id) {
        return super.find(id);
    }

}
