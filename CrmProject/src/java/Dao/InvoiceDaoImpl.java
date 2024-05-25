/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Invoice;
import java.util.List;

/**
 *
 * @author baran
 */
public class InvoiceDaoImpl extends AbstractDao<Invoice> implements DaoOperation<Invoice> {

    public InvoiceDaoImpl() {
        super(Invoice.class);
    }

    @Override
    public void create(Invoice invoice) {
        try {
            super.saveJpa(invoice);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Invoice> getList() {
        return super.findAll();
    }

    @Override
    public Invoice getByid(Long id) {
        return super.find(id);
    }

}
