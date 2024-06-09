/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.InvoiceDaoImpl;
import entity.Invoice;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author baran
 */
@Named
@SessionScoped
public class InvoiceBean implements BaseBean<Invoice>{

    private Invoice Invoice;
    @EJB
    private InvoiceDaoImpl invoiceDaoImpl;

    public Invoice getInvoice() {
        if (this.Invoice == null) {
            this.Invoice = new Invoice();
        }
        return Invoice;
    }

    public void setInvoice(Invoice Invoice) {
        this.Invoice = Invoice;
    }



    @Override
    public void save() {
        this.invoiceDaoImpl.create(this.getInvoice());
    }

    @Override
    public void delete(Long id) {
        this.invoiceDaoImpl.remove(this.getInvoice());
    }

    @Override
    public Invoice getById() {
        return this.invoiceDaoImpl.find(this.getInvoice().getId());
    }

    @Override
    public List<Invoice> getList() {
         return this.invoiceDaoImpl.findAll();
    }
    
}
