/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Product;
import java.util.List;

/**
 *
 * @author furka
 */
public class ProductDaoImpl extends AbstractDao<Product> implements DaoOperation<Product> {

    public ProductDaoImpl() {
        super(Product.class);
    }

    @Override
    public void create(Product product) {
        try {
            super.saveJpa(product);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Product> getList() {
        return super.findAll();
    }

    @Override
    public Product getByid(Long id) {
        return super.find(id);
    }

}
