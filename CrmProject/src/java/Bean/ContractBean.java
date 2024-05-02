/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.ContractDaoImpl;
import entity.Contract;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named(value = "ContractBean")
@SessionScoped
public class ContractBean implements BaseBean<Object> {

    private Contract contract;

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

    public ContractDaoImpl getCampaingDaoImpl() {
        if (this.contractDaoImpl == null) {
            contractDaoImpl = new ContractDaoImpl();
        }
        return contractDaoImpl;
    }

    public void setCampaingDaoImpl(ContractDaoImpl contractDaoImpl) {
        this.contractDaoImpl = contractDaoImpl;
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
    public void delete() {
        this.contractDaoImpl.deleteById(this.getContract(), getContract().getId());
    }

    @Override
    public Object getById() {
        return this.contractDaoImpl.getByid(this.getContract(), getContract().getId());
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
