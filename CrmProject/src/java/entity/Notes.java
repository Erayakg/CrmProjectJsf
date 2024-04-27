/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author baran
 */
@Entity
public class Notes implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String noteData;
    private String noteContent;
    private String title;
    private Date creatDate;
    private Date updateData;
    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Notes(Long id, String noteData, String noteContent, String title, Date creatDate, Date updateData, Customer customer) {
        this.id = id;
        this.noteData = noteData;
        this.noteContent = noteContent;
        this.title = title;
        this.creatDate = creatDate;
        this.updateData = updateData;
        this.customer = customer;
    }

    public Notes() {
    }

    public Notes(Long id) {
        this.id = id;
    }
    

    @Override
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteData() {
        return noteData;
    }

    public void setNoteData(String noteData) {
        this.noteData = noteData;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public Date getUpdateData() {
        return updateData;
    }

    public void setUpdateData(Date updateData) {
        this.updateData = updateData;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
