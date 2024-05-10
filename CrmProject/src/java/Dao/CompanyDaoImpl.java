/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.logging.Level;
import java.util.logging.Logger;
import entity.Company;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baran
 */
public class CompanyDaoImpl extends AbstractDao implements DaoOperation<Company> {

    @Override
    public void createTable(Company t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(Company t) {

        try {

            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Company t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<Company> getList() {
        List<Company> companylist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Company());

            for (Object[] row : table) {
                companylist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return companylist;
    }

    @Override
    public Company getByid(Company t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 public static Company mapToObject(Object[] row) {
       
        Company company=new Company();
        company.setId(((Number) row[0]).longValue());
        company.setMail((String) row [1]);
        company.setAddress((String) row[2]);
        company.setPhone((String)row[3]);
        company.setTaxNumber((Long)row [4]);
        company.setPassword((String )row [5]);
        return company;
 }    

     @Override
    public void update(Long id) {
        Company company= new Company();
        company=this.getByid(company, id);
        try {
            super.update(company, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CompanyDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
