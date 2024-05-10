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
public class PersonalCustomer extends Customer implements BaseEntity {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PersonalCustomer(String name, String surname, List<Notes> notes, Long id, String phone, String address, String mail, String password) {
        super(notes, id, phone, address, mail, password);
        this.name = name;
        this.surname = surname;
    }

    public PersonalCustomer(Long id) {
        super(id);
    }

    public PersonalCustomer() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.surname);
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
        final PersonalCustomer other = (PersonalCustomer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }

    @Override
    public String toString() {
        return "PersonalCustomer{" + "name=" + name + ", surname=" + surname + '}';
    }

}
