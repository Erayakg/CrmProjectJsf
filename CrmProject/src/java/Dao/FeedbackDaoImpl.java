/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Feedback;
import java.util.List;

/**
 *
 * @author baran
 */
public class FeedbackDaoImpl extends AbstractDao<Feedback> implements DaoOperation<Feedback> {

    public FeedbackDaoImpl() {
        super(Feedback.class);
    }

    @Override
    public void create(Feedback feedback) {
        try {
            super.saveJpa(feedback);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Feedback> getList() {
        return super.findAll();
    }

    @Override
    public Feedback getByid(Long id) {
        return super.find(id);
    }

}
