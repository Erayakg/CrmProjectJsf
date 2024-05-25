/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Report;
import java.util.List;

/**
 *
 * @author furka
 */
public class ReportDaoImpl extends AbstractDao<Report> implements DaoOperation<Report> {

    public ReportDaoImpl() {
        super(Report.class);
    }

    @Override
    public void create(Report report) {
        try {
            super.saveJpa(report);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Report> getList() {
        return super.findAll();
    }

    @Override
    public Report getByid(Long id) {
        return super.find(id);
    }

}
