/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ProductDaoImpl;
import entity.Product;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named(value = "ProductBean")
@SessionScoped
public class ProductBean implements BaseBean<Object> {

    private Product product;

    private ProductDaoImpl productDaoImpl;

    public Product getProduct() {
        if (this.product == null) {
            product = new Product();
        }
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductDaoImpl getCampaingDaoImpl() {
        if (this.productDaoImpl == null) {
            productDaoImpl = new ProductDaoImpl();
        }
        return productDaoImpl;
    }

    public void setCampaingDaoImpl(ProductDaoImpl productDaoImpl) {
        this.productDaoImpl = productDaoImpl;
    }

    public ProductBean() {

    }

    public ProductBean(Product product, ProductDaoImpl productDaoImpl) {
        this.product = product;
        this.productDaoImpl = productDaoImpl;
    }

    @Override
    public void save() {

        this.productDaoImpl.create(this.getProduct());
    }

    @Override
    public void delete() {
        this.productDaoImpl.deleteById(this.getProduct(), getProduct().getId());
    }

    @Override
    public Object getById() {
        return this.productDaoImpl.getByid(this.getProduct(), getProduct().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
