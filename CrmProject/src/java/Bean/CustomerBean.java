/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author gbara
 */
@Named(value="CustomerBean")
@SessionScoped
public class CustomerBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String surname;

    public CustomerBean() {
    }

   

    // Getter ve Setter metodları
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    // Veritabanına kaydetme işlemi için metod
    public void saveUser() {
        System.out.println("salgksdf");
        System.out.println("salgksdf");
        System.out.println("salgksdf");
        System.out.println("salgksdf");
        System.out.println("salgksdf");
        System.out.println("salgksdf");
        
    }
    
}
