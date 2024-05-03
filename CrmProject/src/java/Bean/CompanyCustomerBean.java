package Bean;

import Dao.CompanyCustomerDaoImpl;
import entity.CompanyCustomer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@SessionScoped
public class CompanyCustomerBean implements BaseBean<Object> {

    private CompanyCustomer companycustomer;

    private CompanyCustomerDaoImpl companycustomerDaoImpl;

    public CompanyCustomer getCompanyCustomer() {
        if (this.companycustomer == null) {
            companycustomer = new CompanyCustomer();
        }
        return companycustomer;
    }

    public void setCompanyCustomer(CompanyCustomer companycustomer) {
        this.companycustomer = companycustomer;
    }

    public CompanyCustomerDaoImpl getCampaingDaoImpl() {
        if (this.companycustomerDaoImpl == null) {
            companycustomerDaoImpl = new CompanyCustomerDaoImpl();
        }
        return companycustomerDaoImpl;
    }

    public void setCampaingDaoImpl(CompanyCustomerDaoImpl companycustomerDaoImpl) {
        this.companycustomerDaoImpl = companycustomerDaoImpl;
    }

    public CompanyCustomerBean() {

    }

    public CompanyCustomerBean(CompanyCustomer companycustomer, CompanyCustomerDaoImpl companycustomerDaoImpl) {
        this.companycustomer = companycustomer;
        this.companycustomerDaoImpl = companycustomerDaoImpl;
    }

    @Override
    public void save() {

        this.companycustomerDaoImpl.create(this.getCompanyCustomer());
    }

    @Override
    public void delete() {
        this.companycustomerDaoImpl.deleteById(this.getCompanyCustomer(), getCompanyCustomer().getId());
    }

    @Override
    public Object getById() {
        return this.companycustomerDaoImpl.getByid(this.getCompanyCustomer(), getCompanyCustomer().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}