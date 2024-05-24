/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ReportDaoImpl;
import entity.Report;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class ReportBean implements BaseBean<Report> {

    private Report report;

    private ReportDaoImpl reportDaoImpl;

    public Report getReport() {
        if (this.report == null) {
            report = new Report();
        }
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public ReportDaoImpl getCampaingDaoImpl() {
        if (this.reportDaoImpl == null) {
            reportDaoImpl = new ReportDaoImpl();
        }
        return reportDaoImpl;
    }

    public void setCampaingDaoImpl(ReportDaoImpl reportDaoImpl) {
        this.reportDaoImpl = reportDaoImpl;
    }

    public ReportBean() {

    }

    public ReportBean(Report report, ReportDaoImpl reportDaoImpl) {
        this.report = report;
        this.reportDaoImpl = reportDaoImpl;
    }

    @Override
    public void save() {

        this.reportDaoImpl.create(this.getReport());
    }

    @Override
    public void delete(Long id) {
        this.reportDaoImpl.deleteById(this.getReport(), getReport().getId());
    }

    @Override
    public Report getById() {
        return this.reportDaoImpl.getByid(this.getReport(), getReport().getId());
    }

    @Override
    public List<Report> getList() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
