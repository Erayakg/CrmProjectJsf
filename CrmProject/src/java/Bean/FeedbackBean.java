/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.FeedbackDaoImpl;
import entity.Feedback;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class FeedbackBean implements BaseBean<Feedback> {

    private Feedback feedback;
    @EJB
    private FeedbackDaoImpl feedbackDaoImpl;

    public Feedback getFeedback() {
        if (this.feedback == null) {
            feedback = new Feedback();
        }
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }



    public FeedbackBean() {

    }

    public FeedbackBean(Feedback feedback, FeedbackDaoImpl feedbackDaoImpl) {
        this.feedback = feedback;
        this.feedbackDaoImpl = feedbackDaoImpl;
    }

    @Override
    public void save() {

        this.feedbackDaoImpl.create(this.getFeedback());
    }

    @Override
    public void delete(Long id) {
        this.feedbackDaoImpl.remove(this.getFeedback());
    }

    @Override
    public Feedback getById() {
        return this.feedbackDaoImpl.find(getFeedback().getId());
    }

    @Override
    public List<Feedback> getList() {
        return this.feedbackDaoImpl.findAll();
    }
}
