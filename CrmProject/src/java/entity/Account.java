/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


/**
 *
 * @author baran
 */
public abstract class Account implements BaseEntity {

    private Long id;
    private String name;
    private String phone;
    private String Address;
    private String mail;
    private String password;

    public Account(Long id, String name, String phone, String Address, String mail, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.Address = Address;
        this.mail = mail;
        this.password = password;
    }

    public Account() {
    }

    public Account(String name, String phone, String Address, String mail, String password) {
        this.name = name;
        this.phone = phone;
        this.Address = Address;
        this.mail = mail;
        this.password = password;
    }

    public Account(Long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
