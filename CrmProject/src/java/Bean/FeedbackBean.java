/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.FeedbackDaoImpl;
import entity.Feedback;
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

    public FeedbackDaoImpl getCampaingDaoImpl() {
        if (this.feedbackDaoImpl == null) {
            feedbackDaoImpl = new FeedbackDaoImpl();
        }
        return feedbackDaoImpl;
    }

    public void setCampaingDaoImpl(FeedbackDaoImpl feedbackDaoImpl) {
        this.feedbackDaoImpl = feedbackDaoImpl;
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
        this.feedbackDaoImpl.deleteById(this.getFeedback(), getFeedback().getId());
    }

    @Override
    public Feedback getById() {
        return this.feedbackDaoImpl.getByid(this.getFeedback(), getFeedback().getId());
    }

    @Override
    public List<Feedback> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
