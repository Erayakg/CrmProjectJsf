/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.List;

/**
 *
 * @author erayb
 */
public interface  DaoOperation <T> {
    
    public void create(T t);
    
    public void deleteById(Long id);
    
    public List<T> getList(Long id);
    
    public T getByid(Long id);
    
    
    
}
