/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author erayb
 */
public class Customer extends Account {

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }
    
    private List<Notes> notes;

    public Customer(List<Notes> notes, Long id, String phone, String address, String mail, String password) {
        super(id, phone, address, mail, password);
        this.notes = notes;
    }

    public Customer(Long id) {
        super(id);
    }

    public Customer() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.notes);
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
        final Customer other = (Customer) obj;
        return Objects.equals(this.notes, other.notes);
    }

    @Override
    public String toString() {
        return "Customer{" + "notes=" + notes + '}';
    }

   
   

}
