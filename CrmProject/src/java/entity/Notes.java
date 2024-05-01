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

public class Notes implements BaseEntity {

  
    private Long id;
    private String noteData;
    private String noteContent;
    private String title;
    private Date creatDate;
    private Date updateData;
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
