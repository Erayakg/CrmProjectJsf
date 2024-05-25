/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.CompanyCustomer;
import java.util.List;

/**
 *
 * @author furka
 */
public class CompanyCustomerDaoImpl extends AbstractDao<CompanyCustomer> implements DaoOperation<CompanyCustomer> {

    public CompanyCustomerDaoImpl() {
        super(CompanyCustomer.class);
    }

    @Override
    public void create(CompanyCustomer companyCustomer) {
        try {
            super.saveJpa(companyCustomer);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<CompanyCustomer> getList() {
        return super.findAll();
    }

    @Override
    public CompanyCustomer getByid(Long id) {
        return super.find(id);
    }

}
