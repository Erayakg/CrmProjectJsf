/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author erayb
 */
public class CompanyCustomer implements BaseEntity {
    private Long id;
    private String phone;
    private String address;
    private String mail;
    private String password;
    private String companyName;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyCustomer() {
    }

    public CompanyCustomer(Long id, String phone, String address, String mail, String password, String companyName) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.password = password;
        this.companyName = companyName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.phone);
        hash = 59 * hash + Objects.hashCode(this.address);
        hash = 59 * hash + Objects.hashCode(this.mail);
        hash = 59 * hash + Objects.hashCode(this.password);
        hash = 59 * hash + Objects.hashCode(this.companyName);
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
        final CompanyCustomer other = (CompanyCustomer) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "CompanyCustomer{" + "id=" + id + ", phone=" + phone + ", address=" + address + ", mail=" + mail + ", password=" + password + ", companyName=" + companyName + '}';
    }

    
}
