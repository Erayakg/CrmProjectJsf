/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author baran
 */
public class Company implements BaseEntity {

    private Long id;
    private String companyName;
    private Date creationDate;
    private Long TaxNumber;
    private String phone;
    private String Address;
    private String mail;

    public Company(Long id, String companyName, Date creationDate, Long TaxNumber, String phone, String Address, String mail) {
        this.id = id;
        this.companyName = companyName;
        this.creationDate = creationDate;
        this.TaxNumber = TaxNumber;
        this.phone = phone;
        this.Address = Address;
        this.mail = mail;
    }

    public Company() {
    }

    public Company(Long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(Long TaxNumber) {
        this.TaxNumber = TaxNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
