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
public class PersonalCustomer implements BaseEntity {

    private Long id;
    private String phone;
    private String address;
    private String mail;
    private String password;
    private String name;
    private String surname;

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

    public PersonalCustomer(Long id, String phone, String address, String mail, String password, String name, String surname) {
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public PersonalCustomer() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.phone);
        hash = 43 * hash + Objects.hashCode(this.address);
        hash = 43 * hash + Objects.hashCode(this.mail);
        hash = 43 * hash + Objects.hashCode(this.password);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.surname);
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
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "PersonalCustomer{" + "id=" + id + ", phone=" + phone + ", address=" + address + ", mail=" + mail + ", password=" + password + ", name=" + name + ", surname=" + surname + '}';
    }

}
