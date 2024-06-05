package Bean;

import Dao.CompanyCustomerDaoImpl;
import entity.CompanyCustomer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Named;
import java.util.List;

@Named
@SessionScoped
public class CompanyCustomerBean implements BaseBean<CompanyCustomer> {

    private CompanyCustomer companycustomer;

    private CompanyCustomerDaoImpl companyCustomerDaoImpl;

     public CompanyCustomerBean() {
           
    }

    public CompanyCustomerBean(CompanyCustomer companycustomer, CompanyCustomerDaoImpl companyCustomerDaoImpl) {
        this.companycustomer = companycustomer;
        this.companyCustomerDaoImpl = companyCustomerDaoImpl;
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

    public CompanyCustomerDaoImpl getCompanycustomerDaoImpl() {
        if (this.companyCustomerDaoImpl == null) {
            companyCustomerDaoImpl = new CompanyCustomerDaoImpl();
        }
        return companyCustomerDaoImpl;
    }

    public void setCampaingDaoImpl(CompanyCustomerDaoImpl companycustomerDaoImpl) {
        this.companyCustomerDaoImpl = companycustomerDaoImpl;
    }
   
    @Override
    public void save() {
        this.getCompanycustomerDaoImpl().create(this.getCompanyCustomer());
    }

    @Override
    public void delete(Long id) {
        this.getCompanycustomerDaoImpl().deleteById(this.getCompanyCustomer().getId());
    }

    @Override
    public List<CompanyCustomer> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CompanyCustomer getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void login(){
        
    }
    public void register(){
        
    }
    public boolean validatePassword(FacesContext context, UIComponent cmp, Object value)throws ValidatorException{
        String v=(String) value;
        if(v.isEmpty()){
            throw new ValidatorException(new FacesMessage("Şifre alanı boş olamaz!"));
        }else if(v.length()<8){
             throw new ValidatorException(new FacesMessage("Şifre alanı 8 karakterden az olamaz!"));
        }
        return true;
    }
}