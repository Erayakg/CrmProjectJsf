/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Feedback implements  BaseEntity{
    private long id;
    //customerİd,personelİd,urunİd
    private  String subject;
    private  String desciprtion;

    @Override
    public long getId() {
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesciprtion() {
        return desciprtion;
    }

    public void setDesciprtion(String desciprtion) {
        this.desciprtion = desciprtion;
    }

    public Feedback(long id, String subject, String desciprtion) {
        this.id = id;
        this.subject = subject;
        this.desciprtion = desciprtion;
    }

    public Feedback() {
    }
    
    
}
