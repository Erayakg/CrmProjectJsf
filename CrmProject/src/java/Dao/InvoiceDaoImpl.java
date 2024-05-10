/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import entity.Invoice;
import entity.Orders;
import entity.Product;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baran
 */
public class InvoiceDaoImpl extends AbstractDao implements DaoOperation<Invoice> {
    
    @Override
    public void createTable(Invoice t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void create(Invoice t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }
    
    @Override
    public void deleteById(Invoice t, Long id) {
        super.delete(t, id);
    }
    
    @Override
    public List<Invoice> getList() {
        List<Invoice> invoicelist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Invoice());

            for (Object[] row : table) {
                invoicelist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvoiceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return invoicelist;
    }

    @Override
    public Invoice getByid(Invoice t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 public static Invoice mapToObject(Object[] row) {
       
        Invoice invoice=new Invoice();
        invoice.setId(((Number) row[0]).longValue());
        invoice.setOrderDate((LocalDateTime) row [1]);
        invoice.setShippingAddress((String) row[2]);
        invoice.setStatus((boolean)row[3]);
        invoice.setTotalAmount(((Number)row [4]).floatValue());
        invoice.setOrder((Orders )(Object )row [5]);
        invoice.setBillingAddress((String)row [6]);
        return invoice;
 }    

     @Override
    public void update(Long id) {
        Invoice invoice= new Invoice();
        invoice=this.getByid(invoice, id);
        try {
            super.update(invoice, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InvoiceDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
