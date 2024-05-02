/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.InvoiceDaoImpl;
import entity.Invoice;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author baran
 */
@Named(value = "InvoiceBean")
@SessionScoped
public class InvoiceBean implements BaseBean<Object>{

    private Invoice Invoice;
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

    public InvoiceDaoImpl getInvoiceDaoImpl() {
        if (this.invoiceDaoImpl == null) {
            this.invoiceDaoImpl = new InvoiceDaoImpl();
        }
        return invoiceDaoImpl;
    }

    public void setInvoiceDaoImpl(InvoiceDaoImpl invoiceDaoImpl) {
        this.invoiceDaoImpl = invoiceDaoImpl;
    }

    @Override
    public void save() {
        this.getInvoiceDaoImpl().create(this.getInvoice());
    }

    @Override
    public void delete() {
        this.getInvoiceDaoImpl().deleteById(this.getInvoice(), this.getInvoice().getId());
    }

    @Override
    public Object getById() {
        return this.getInvoiceDaoImpl().getByid(this.getInvoice(), this.getInvoice().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
