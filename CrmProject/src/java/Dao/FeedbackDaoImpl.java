/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Employee;
import entity.Feedback;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author furka
 */
public class FeedbackDaoImpl extends AbstractDao implements DaoOperation<Feedback> {
    
    @Override
    public void createTable(Feedback t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(Feedback t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Feedback t, Long id) {
        super.delete(t, id);
    }
    
  @Override
    public List<Feedback> getList() {
        List<Feedback> feedbacklist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Feedback());

            for (Object[] row : table) {
                feedbacklist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedbackDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return feedbacklist;
    }

    @Override
    public Feedback getByid(Feedback t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 public static Feedback mapToObject(Object[] row) {
       
        Feedback feedback=new Feedback();
        feedback.setId(((Number) row[0]).longValue());
        feedback.setTitle((String) row [1]);
        feedback.setDescription((String) row[2]);
        feedback.setStatus((boolean)row[3]);
        feedback.setSubject((String)row [4]);
        feedback.setEmployee((Employee )(Object )row [5]);
        feedback.setResponse((String )row [6]);
        return feedback;
 }    

     @Override
    public void update(Long id) {
        Feedback feedback= new Feedback();
        feedback=this.getByid(feedback, id);
        try {
            super.update(feedback, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FeedbackDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
