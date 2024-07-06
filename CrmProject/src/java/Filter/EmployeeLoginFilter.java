/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filter;

import entity.Customer;
import entity.Employee;
import entity.demoCustomer;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author baran
 */
@WebFilter("/*")
public class EmployeeLoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) sr;
        HttpServletResponse response = (HttpServletResponse) sr1;
        String url = request.getRequestURI();
        HttpSession session = request.getSession();
        Employee employee=null;
        if (session != null) {
            employee = (Employee) session.getAttribute("employee");
        }
        if (employee == null) {
            if (url.contains("productAdd")) {
                response.sendRedirect(request.getContextPath() + "/panel/homepage/account/employeeLogin.xhtml");
            } else {
                fc.doFilter(sr, sr1);
            }
        } else{
            fc.doFilter(sr, sr1);
        }
        
        
        
        /*else {
            if (url.contains("employee")) {
                response.sendRedirect(request.getContextPath() + "/panel/homepage/homepage.xhtml");
            } else {
                fc.doFilter(sr, sr1);
            }

        }*/

    }

}