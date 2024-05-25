/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Orders;
import java.util.List;

/**
 *
 * @author furka
 */
public class OrderDaoImpl extends AbstractDao<Orders> implements DaoOperation<Orders> {

    public OrderDaoImpl() {
        super(Orders.class);
    }

    @Override
    public void create(Orders orders) {
        try {
            super.saveJpa(orders);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Orders> getList() {
        return super.findAll();
    }

    @Override
    public Orders getByid(Long id) {
        return super.find(id);
    }

}
