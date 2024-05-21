package Bean;

import Dao.CompanyCustomerDaoImpl;
import entity.CompanyCustomer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

@Named
@SessionScoped
public class CompanyCustomerBean implements BaseBean<CompanyCustomer> {

    private CompanyCustomer companycustomer;

    private CompanyCustomerDaoImpl companycustomerDaoImpl;

     public CompanyCustomerBean() {
           companycustomerDaoImpl = new CompanyCustomerDaoImpl();
    }

    public CompanyCustomerBean(CompanyCustomer companycustomer, CompanyCustomerDaoImpl companycustomerDaoImpl) {
        this.companycustomer = companycustomer;
        this.companycustomerDaoImpl = companycustomerDaoImpl;
    }
    
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

   
    @Override
    public void save() {
        if(this.companycustomer==null){
            this.companycustomer=new CompanyCustomer();
        }
        this.companycustomerDaoImpl.createTable(this.getCompanyCustomer());
            
        this.companycustomerDaoImpl.create(this.getCompanyCustomer());
    }

    @Override
    public void delete(Long id) {
        this.companycustomerDaoImpl.deleteById(this.getCompanyCustomer(), getCompanyCustomer().getId());
    }
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public List<CompanyCustomer> getList() {
        return this.companycustomerDaoImpl.getList();
    }

    @Override
    public CompanyCustomer getById() {
        return this.companycustomerDaoImpl.getByid(getCompanyCustomer(),getCompanyCustomer().getId());
    }

    
    public void update1() {
       this.companycustomerDaoImpl.update(getCompanyCustomer(),getCompanyCustomer().getId());
    }

}