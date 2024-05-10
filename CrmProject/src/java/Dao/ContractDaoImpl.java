/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import entity.Contract;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author furka
 */
public class ContractDaoImpl extends AbstractDao implements DaoOperation<Contract> {

    @Override
    public void createTable(Contract t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(Contract t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Contract t, Long id) {
        super.delete(t, id);
    }

  @Override
    public List<Contract> getList() {
        List<Contract> contractlist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Contract());

            for (Object[] row : table) {
                contractlist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contractlist;
    }

    @Override
    public Contract getByid(Contract t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
 public static Contract mapToObject(Object[] row) {
       
        Contract contract=new Contract();
        contract.setId(((Number) row[0]).longValue());
        contract.setName((String) row [1]);
        contract.setAmount(((Number) row[2]).longValue());
        contract.setDescription((String)row[3]);
        contract.setStatus((String)row [4]);
        contract.setStartDate((Date )row [5]);
        contract.setFinishDate((Date )row [6]);
        return contract;
 }    

     @Override
    public void update(Long id) {
        Contract company= new Contract();
        company=this.getByid(company, id);
        try {
            super.update(company, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ContractDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
