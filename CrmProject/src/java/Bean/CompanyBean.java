/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.CompanyDaoImpl;
import entity.Company;
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

    public CompanyDaoImpl getCompanyDaoImpl() {
        if (this.companyDaoImpl == null) {
            this.companyDaoImpl = new CompanyDaoImpl();
        }
        return companyDaoImpl;
    }

    public void setCompanyDaoImpl(CompanyDaoImpl companyDaoImpl) {
        this.companyDaoImpl = companyDaoImpl;
    }

    @Override
    public void save() {
        this.getCompanyDaoImpl().createTable(this.getCompany());
        this.getCompanyDaoImpl().create(this.getCompany());
    }

    @Override
    public void delete(Long id) {
        this.getCompanyDaoImpl().deleteById(this.getCompany(), this.getCompany().getId());
    }
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public List<Company> getList() {
        return this.getCompanyDaoImpl().getList();
    }

    @Override
    public Company getById() {
        return this.getCompanyDaoImpl().getByid(this.getCompany(), this.getCompany().getId());
    }

    public void update1() {
        if(this.getCompanyDaoImpl()==null)
            save();
        this.getCompany().setId(1L);
        this.getCompanyDaoImpl().update(getCompany(),this.getCompany().getId());
    }

    

}
