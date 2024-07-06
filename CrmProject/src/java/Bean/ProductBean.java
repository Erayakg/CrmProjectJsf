/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ProductDaoImpl;
import entity.Document;
import entity.Invoice;
import util.Connector;
import java.sql.Connection;
import jakarta.ejb.EJB;
import entity.Product;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class ProductBean implements BaseBean<Product> {

    private Connector connector;
    private Connection connection;

    private Product product;
    @EJB
    private ProductDaoImpl productDaoImpl;

    private Part doc;

    private int currentPage = 0;
    private int pageSize = 10;
    private int totalProducts;
    private List<Product> productList;

    public Product getProduct() {

        if (this.product == null) {
            product = new Product();
        }
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private final String uploadTo = "C:\\Users\\gbara\\upload\\";

    public void upload() {
        try {
            InputStream input = doc.getInputStream();
            File file = new File(uploadTo + doc.getSubmittedFileName());
            Files.copy(input, file.toPath());

            // Product bilgilerini ayarla
            Product p = new Product();
            p.setName(product.getName()); // name bilgisini ayarla
            p.setDescription(product.getDescription()); // description bilgisini ayarla
            p.setPrice(product.getPrice()); // price bilgisini ayarla
            p.setIsActive(product.getIsActive()); // isActive bilgisini ayarla
            p.setFilePath(file.getParent());
            p.setFileName(file.getName());
            p.setFileType(doc.getContentType());

            productDaoImpl.insert(p);

            // Formu temizle
            this.product = new Product();

        } catch (Exception e) {
            System.out.println("Yükleme hatası: " + e.getMessage());
        }
    }

    public List<Product> getProductList() {
        if (productList == null) {
            loadProducts();
        }
        return productList;
    }

    private void loadProducts() {
        totalProducts = productDaoImpl.count();
        int[] range = {currentPage * pageSize, (currentPage + 1) * pageSize - 1};
        productList = productDaoImpl.findRange(range);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        loadProducts();
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) totalProducts / pageSize);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        loadProducts();
    }

    public void nextPage() {
        if (currentPage < getTotalPages() - 1) {
            currentPage++;
            loadProducts();
        }
    }

    public void previousPage() {
        if (currentPage > 0) {
            currentPage--;
            loadProducts();
        }
    }

    @Override
    public void save() {
        productDaoImpl.create(this.getProduct());
    }

    @Override
    public void delete(Long id) {
        Product productToDelete = productDaoImpl.find(id);
        if (productToDelete != null) {
            productDaoImpl.remove(productToDelete);
        } else {
            System.out.println("Product with ID " + id + " not found.");
            // Optionally, you can add a FacesMessage to notify the user.
        }
    }

    @Override
    public Product getById() {
        return productDaoImpl.find(getProduct().getId());
    }

    @Override
    public List<Product> getList() {
        return productDaoImpl.findAll();
    }

    public Connector getConnector() {
        if (this.connector == null) {
            this.connector = new Connector();
        }
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getConnector().connect();
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /*
    public List<Invoice> getInvoiceListByProductId(Product product){
        
        return productDaoImpl.getInvoiceListByProductId(product.getId());
        
    }
     */
    public Part getDoc() {
        return doc;
    }

    public void setDoc(Part doc) {
        this.doc = doc;
    }

}
