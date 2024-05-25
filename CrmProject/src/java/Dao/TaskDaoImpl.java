/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Task;
import java.util.List;

/**
 *
 * @author furka
 */
public class TaskDaoImpl extends AbstractDao<Task> implements DaoOperation<Task> {

    public TaskDaoImpl() {
        super(Task.class);
    }

    @Override
    public void create(Task task) {
        try {
            super.saveJpa(task);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Task> getList() {
        return super.findAll();
    }

    @Override
    public Task getByid(Long id) {
        return super.find(id);
    }

}
