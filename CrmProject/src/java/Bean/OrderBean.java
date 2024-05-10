/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.OrderDaoImpl;
import Dao.ProductDaoImpl;
import entity.Order;
import entity.Product;
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

    private OrderDaoImpl orderDaoImpl;

    private ProductDaoImpl productDao;
    
    public ProductDaoImpl getProductDaoImpl() {
        if (this.productDao == null) {
            productDao = new ProductDaoImpl();
        }
        return productDao;
    }

    
    public Order getOrder() {
        if (this.order == null) {
            order = new Order();
        }
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderDaoImpl getCampaingDaoImpl() {
        if (this.orderDaoImpl == null) {
            orderDaoImpl = new OrderDaoImpl();
        }
        return orderDaoImpl;
    }

    public void setCampaingDaoImpl(OrderDaoImpl orderDaoImpl) {
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
    public void delete() {
        this.orderDaoImpl.deleteById(this.getOrder(), getOrder().getId());
    }

    @Override
    public Order getById() {
        return this.orderDaoImpl.getByid(this.getOrder(), getOrder().getId());
    }

    @Override
    public List<Order> getList() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   
    
    public void setProduct(Order o ,Product p){
        productDao.addProductToCampaign(o, p);
        
    }
}
