/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import Dao.TaskDaoImpl;

import entity.Task;
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
@FacesConverter(value = "taskConverter", managed = true)
public class TaskConverter implements Converter, Serializable {

	@EJB
	private TaskDaoImpl dao;

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
			Task c = (Task) t;
            return String.valueOf(c.getId()); 
		} else {
			return "";
		}
	}

}
