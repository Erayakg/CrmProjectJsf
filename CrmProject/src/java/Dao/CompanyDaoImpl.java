/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Company;
import java.util.List;

/**
 *
 * @author baran
 */
public class CompanyDaoImpl extends AbstractDao<Company> implements DaoOperation<Company> {

    public CompanyDaoImpl() {
        super(Company.class);
    }

    @Override
    public void create(Company company) {
        try {
            super.saveJpa(company);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Company> getList() {
        return super.findAll();
    }

    @Override
    public Company getByid(Long id) {
        return super.find(id);
    }

}
