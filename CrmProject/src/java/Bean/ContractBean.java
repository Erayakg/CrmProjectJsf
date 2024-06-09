/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ContractDaoImpl;
import entity.Contract;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class ContractBean implements BaseBean<Contract> {

    private Contract contract;
    @EJB
    private ContractDaoImpl contractDaoImpl;

    public Contract getContract() {
        if (this.contract == null) {
            contract = new Contract();
        }
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }



    public ContractBean() {

    }

    public ContractBean(Contract contract, ContractDaoImpl contractDaoImpl) {
        this.contract = contract;
        this.contractDaoImpl = contractDaoImpl;
    }

    @Override
    public void save() {

        this.contractDaoImpl.create(this.getContract());
    }

    @Override
    public void delete(Long id) {
        this.contractDaoImpl.remove(this.getContract());
    }

    @Override
    public Contract getById() {
        return this.contractDaoImpl.find(getContract().getId());
    }

    @Override
    public List<Contract> getList() {
       return this.contractDaoImpl.findAll();
    }
}
