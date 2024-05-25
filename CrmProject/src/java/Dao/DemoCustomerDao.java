/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.demoCustomer;
import java.util.List;

/**
 *
 * @author erayb
 */
public class DemoCustomerDao extends AbstractDao<demoCustomer> implements DaoOperation<demoCustomer> {

    public DemoCustomerDao(Class<demoCustomer> entityClass) {
        super(demoCustomer.class);
    }

    @Override
    public void create(demoCustomer demoCustomer) {
        try {
            super.saveJpa(demoCustomer);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<demoCustomer> getList() {
        return super.findAll();
    }

    @Override
    public demoCustomer getByid(Long id) {
        return super.find(id);
    }

}
