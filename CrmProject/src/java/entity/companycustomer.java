/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author baran
 */
public class CompanyCustomer extends Customer{
    private String companyInformation;

    public String getCompanyInformation() {
        return companyInformation;
    }

    public void setCompanyInformation(String companyInformation) {
        this.companyInformation = companyInformation;
    }

    public CompanyCustomer(String companyInformation, String surName, int zipCode, String address, String country, String city, List<Notes> notes, Long id, String name, String phone, String Address, String mail, String password) {
        super(surName, zipCode, address, country, city, notes, id, name, phone, Address, mail, password);
        this.companyInformation = companyInformation;
    }

    

    public CompanyCustomer() {
    }

    @Override
    public String toString() {
        return "CompanyCustomer{" + "companyInformation=" + companyInformation + '}';
    }
    
}
