/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.CompanyDaoImpl;
import entity.Company;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author baran
 */
@Named
@SessionScoped
public class CompanyBean implements BaseBean<Company> {

    private Company Company;
    
    @EJB
    private CompanyDaoImpl companyDaoImpl;

    public Company getCompany() {
        if (this.Company == null) {
            this.Company = new Company();
        }
        return Company;
    }

    public void setCompany(Company Company) {
        this.Company = Company;
    }



    @Override
    public void save() {
        this.companyDaoImpl.create(this.getCompany());
    }

    @Override
    public void delete(Long id) {
        this.companyDaoImpl.remove(this.getCompany());
    }


    @Override
    public List<Company> getList() {
        return this.companyDaoImpl.findAll();
    }

    @Override
    public Company getById() {
        return this.companyDaoImpl.find(getCompany().getId());
    }

}
