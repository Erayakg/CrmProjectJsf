/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.CampaignDaoImpl;
import entity.Campaign;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author baran
 */
@Named(value = "CampaingBean")
@SessionScoped
public class CampaignBean  implements BaseBean<Object>{
    
    private Campaign campaign;
    
    private CampaignDaoImpl campaingDaoImpl;

    public Campaign getCampaign() {
        if (this.campaign == null) {
            campaign = new Campaign();
        }
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public CampaignDaoImpl getCampaingDaoImpl() {
        if (this.campaingDaoImpl == null) {
            campaingDaoImpl = new CampaignDaoImpl();
        }
        return campaingDaoImpl;
    }

    public void setCampaingDaoImpl(CampaignDaoImpl campaingDaoImpl) {
        this.campaingDaoImpl = campaingDaoImpl;
    }

    public CampaignBean() {

    }

    public CampaignBean(Campaign campaign, CampaignDaoImpl campaingDaoImpl) {
        this.campaign = campaign;
        this.campaingDaoImpl = campaingDaoImpl;
    }

    @Override
    public void save() {

        this.getCampaingDaoImpl().create(getCampaign());
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    


}
