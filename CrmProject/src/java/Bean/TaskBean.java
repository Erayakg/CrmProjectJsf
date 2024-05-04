/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.TaskDaoImpl;
import entity.Task;
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

    public TaskDaoImpl getCampaingDaoImpl() {
        if (this.taskDaoImpl == null) {
            taskDaoImpl = new TaskDaoImpl();
        }
        return taskDaoImpl;
    }

    public void setCampaingDaoImpl(TaskDaoImpl taskDaoImpl) {
        this.taskDaoImpl = taskDaoImpl;
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
    public void delete() {
        this.taskDaoImpl.deleteById(this.getTask(), getTask().getId());
    }

    @Override
    public Task getById() {
        return this.taskDaoImpl.getByid(this.getTask(), getTask().getId());
    }

    @Override
    public List<Task> getList() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
