/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author 90552
 */

public class Report extends Contact implements BaseEntity{

    private LocalDateTime date;  
    private  String ReportEmail;

    
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getReportEmail() {
        return ReportEmail;
    }

    public void setReportEmail(String ReportEmail) {
        this.ReportEmail = ReportEmail;
    }

    public Report( LocalDateTime date, String ReportEmail, Long id, String subject, String description, String title) {
        super(id, subject, description, title);
        this.date = date;
        this.ReportEmail = ReportEmail;
    }

    public Report() {
    }

    public Report(Long id) {
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.ReportEmail);
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
        final Report other = (Report) obj;
        if (!Objects.equals(this.ReportEmail, other.ReportEmail)) {
            return false;
        }
        return Objects.equals(this.date, other.date);
    }

    @Override
    public String toString() {
        return "Report{" + "date=" + date + ", ReportEmail=" + ReportEmail + '}';
    }

   
  
    
}
