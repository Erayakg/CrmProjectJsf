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
@Named
@SessionScoped
public class ProductBean implements BaseBean<Product> {

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

    @Override
    public void save() {
        getCampaingDaoImpl().createTable(product);
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Product> getList() {
        return null;
    }

}
