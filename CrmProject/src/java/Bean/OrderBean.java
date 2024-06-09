/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.OrderDaoImpl;
import Dao.ProductDaoImpl;
import entity.Order;
import entity.Product;
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
public class OrderBean implements BaseBean<Order> {

    private Order order;
    
    @EJB
    private OrderDaoImpl orderDaoImpl;
   
    
    
 

    public Order getOrder() {
        if (this.order == null) {
            order = new Order();
        }
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderDaoImpl getOrderDaoImpl() {
        if (this.orderDaoImpl == null) {
            orderDaoImpl = new OrderDaoImpl();
        }
        return orderDaoImpl;
    }

    public void setOrderDaoImpl(OrderDaoImpl orderDaoImpl) {
        this.orderDaoImpl = orderDaoImpl;
    }

    public OrderBean() {

    }

    public OrderBean(Order order, OrderDaoImpl orderDaoImpl) {
        this.order = order;
        this.orderDaoImpl = orderDaoImpl;
    }

    @Override
    public void save() {
        
       this.orderDaoImpl.create(this.getOrder());
    }

    @Override
    public void delete(Long id) {
        this.orderDaoImpl.remove(this.getOrder());
    }

    @Override
    public Order getById() {
        return this.orderDaoImpl.find(getOrder().getId());
    }

    @Override
    public List<Order> getList() {
            return this.orderDaoImpl.findAll();
    }


}
