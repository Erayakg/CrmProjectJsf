/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.OrderDaoImpl;
import Dao.ProductDaoImpl;
import entity.Orders;
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
public class OrderBean implements BaseBean<Orders> {

    private Orders order;

    private OrderDaoImpl orderDaoImpl;
    private ProductDaoImpl productDaoImpl;
    
    
    public ProductDaoImpl getProductDaoImpl() {
        if (this.productDaoImpl == null) {
            productDaoImpl = new ProductDaoImpl();
        }
        return productDaoImpl;
    }

    public Orders getOrder() {
        if (this.order == null) {
            order = new Orders();
        }
        return order;
    }

    public void setOrder(Orders order) {
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

    public OrderBean(Orders order, OrderDaoImpl orderDaoImpl) {
        this.order = order;
        this.orderDaoImpl = orderDaoImpl;
    }

    @Override
    public void save() {

        getOrderDaoImpl().createTable(order);
        getOrderDaoImpl().create(order);
    }

    @Override
    public void delete(Long id) {
        getOrderDaoImpl().deleteById(order, id);
    }

    @Override
    public Orders getById() {
        return getOrderDaoImpl().getByid(this.getOrder(), getOrder().getId());
    }

    @Override
    public List<Orders> getList() {
            return getOrderDaoImpl().getList();
    }
    public void addProductToOrder(Orders o,Product p){
        productDaoImpl.addProductToOrder(o,p);
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
