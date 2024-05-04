package navigationBean;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class NavigationBean {

    public NavigationBean() {
    }

    public String login() {
         return "adminpanel";
    }
}