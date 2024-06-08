package UserSession;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named(value = "userSession")
@SessionScoped
public class UserSession implements Serializable {
    private boolean loggedIn;
    private String role; // "customer" or "employee"

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Simulate login methods
    public String loginAsCustomer() {
        this.loggedIn = true;
        this.role = "customer";
        return "/panel/homepage/homepage.xhtml?faces-redirect=true";
    }

    public String loginAsEmployee() {
        this.loggedIn = true;
        this.role = "employee";
        return "/panel/homepage/homepage.xhtml?faces-redirect=true";
    }

    public String logout() {
        this.loggedIn = false;
        this.role = null;
        return "/panel/homepage/homepage.xhtml?faces-redirect=true";
    }
}
