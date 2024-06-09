/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.TaskDaoImpl;
import entity.Task;
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
public class TaskBean implements BaseBean<Task> {
     private Task task;
    @EJB
    private TaskDaoImpl taskDaoImpl;

    public Task getTask() {
        if (this.task == null) {
            //task = new Task();
        }
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }



    public TaskBean() {

    }

    public TaskBean(Task task, TaskDaoImpl taskDaoImpl) {
        this.task = task;
        this.taskDaoImpl = taskDaoImpl;
    }

    @Override
    public void save() {

        this.taskDaoImpl.create(this.getTask());
    }

    @Override
    public void delete(Long id) {
        this.taskDaoImpl.remove(this.getTask());
    }

    @Override
    public Task getById() {
        return this.taskDaoImpl.find(getTask().getId());
    }

    @Override
    public List<Task> getList() {
        return this.taskDaoImpl.findAll();
    }

  
}
