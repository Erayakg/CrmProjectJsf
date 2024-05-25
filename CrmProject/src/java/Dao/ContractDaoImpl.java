/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Contract;
import java.util.List;

/**
 *
 * @author baran
 */
public class ContractDaoImpl extends AbstractDao<Contract> implements DaoOperation<Contract> {

    public ContractDaoImpl() {
        super(Contract.class);
    }

    @Override
    public void create(Contract contract) {
        try {
            super.saveJpa(contract);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Contract> getList() {

        return super.findAll();
    }

    @Override
    public Contract getByid(Long id) {
        return super.find(id);
    }

}
