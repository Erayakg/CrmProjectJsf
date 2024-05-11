package navigation;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class NavigationBean implements Serializable {

    
    public String isActive(String viewId) {
        String currentViewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        return currentViewId.contains(viewId) ? "active" : "";
    }

    public String goToDashboard() {
        return "/panel/admin/dashboard/dashboard.xhtml?faces-redirect=true";
    }

    public String goToFeedbacks() {
        return "/panel/admin/contact/feedbacks/feedbackpage.xhtml?faces-redirect=true";
    }

    public String goToReports() {
        return "/panel/admin/contact/reports/reportpage.xhtml?faces-redirect=true";
    }

    public String goToProducts() {
        return "/panel/admin/products/productpage.xhtml?faces-redirect=true";
    }

    public String goToEmployeeLogin() {
        return "/panel/admin/access/employeeLogin.xhtml?faces-redirect=true";
    }

    public String goToEmployeeRegister() {
        return "/panel/admin/access/employeeRegister.xhtml?faces-redirect=true";
    }

    public String goToOrders() {
        return "/panel/admin/dashboard/orders/orderpage.xhtml?faces-redirect=true";
    }

    public String goToPersonalCustomers() {
        return "/panel/admin/dashboard/customers/personalCustomer.xhtml?faces-redirect=true";
    }

    public String goToCompanyCustomers() {
        return "/panel/admin/dashboard/customers/companyCustomer.xhtml?faces-redirect=true";
    }
}
