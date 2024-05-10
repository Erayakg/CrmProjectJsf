/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Objects;

/**
 *
 * @author baran
 */
public class Company extends Account {
    
    private Long taxNumber;

    public Long getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Long taxNumber) {
        this.taxNumber = taxNumber;
    }

    public Company(Long taxNumber, Long id, String phone, String address, String mail, String password) {
        super(id, phone, address, mail, password);
        this.taxNumber = taxNumber;
    }

    public Company() {
    }

    public Company(Long id) {
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.taxNumber);
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
        final Company other = (Company) obj;
        return Objects.equals(this.taxNumber, other.taxNumber);
    }

    @Override
    public String toString() {
        return "Company{" + "taxNumber=" + taxNumber + '}';
    }
    
    

}
