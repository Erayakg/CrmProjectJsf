/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import Dao.FeedbackDaoImpl;

import entity.Feedback;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;


@Named
@RequestScoped
@FacesConverter(value = "feedbackConverter", managed = true)
public class FeedbackConverter implements Converter, Serializable {

	@EJB
	private FeedbackDaoImpl dao;

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
		if (!string.isBlank()) {
			Long id = Long.valueOf(string);
			return dao.find(id);
		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object t) {
		if (t != null) {
			Feedback c = (Feedback) t;
            return String.valueOf(c.getId()); 
		} else {
			return "";
		}
	}

}
