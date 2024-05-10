/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

public class Feedback  extends Contact implements  BaseEntity{
    //customerİd,personelID,urunİd
    
    private String response;
    private Boolean status;
    
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

    public Feedback(String response, Boolean status, Long id, String subject, String description, String title) {
        super(id, subject, description, title);
        this.response = response;
        this.status = status;
    }

    public Feedback() {
    }

    public Feedback(Long id) {
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.response);
        hash = 47 * hash + Objects.hashCode(this.status);
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
        if (!Objects.equals(this.response, other.response)) {
            return false;
        }
        return Objects.equals(this.status, other.status);
    }

    @Override
    public String toString() {
        return "Feedback{" + "response=" + response + ", status=" + status + '}';
    }

   
    

    
}
