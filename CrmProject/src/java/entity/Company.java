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
public class Company extends Account {

    private Date creationDate;
    private Long TaxNumber;

    public Company(Long id, String name, Date creationDate, Long TaxNumber, String phone, String Address, String mail, String password) {
        super(id, name, phone, Address, mail, password);
        this.creationDate = creationDate;
        this.TaxNumber = TaxNumber;
    }

    public Company(Long id) {
        super(id);
    }

    public Company(String name, Date creationDate, Long TaxNumber, String phone, String Address, String mail, String password) {
        super(name, phone, Address, mail, password);
        this.creationDate = creationDate;
        this.TaxNumber = TaxNumber;
    }

    public Company() {
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

}
