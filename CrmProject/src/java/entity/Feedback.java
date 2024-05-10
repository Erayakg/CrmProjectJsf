/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

public class Feedback  implements  BaseEntity{
    private Long id;
    private String subject;
    private String description;
    private String title;
    private String response;
    private Boolean status;
    private Employee employee;
    private Customer customer;
    
    

    @Override
    public Long getId() {
       return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Feedback(Long id, String subject, String description, String title, String response, Boolean status, Employee employee, Customer customer) {
        this.id = id;
        this.subject = subject;
        this.description = description;
        this.title = title;
        this.response = response;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
    }

    public Employee getEmployee() {
        if(employee==null)
            employee=new Employee();
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        if(customer==null)
            customer=new Customer();
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    

    public Feedback() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Feedback other = (Feedback) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Feedback{" + "id=" + id + ", subject=" + subject + ", description=" + description + ", title=" + title + ", response=" + response + ", status=" + status + ", employee=" + employee + ", customer=" + customer + '}';
    }

   

   
    
    
}
