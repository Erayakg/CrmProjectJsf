/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.CampaignDaoImpl;
import entity.Campaign;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author baran
 */
@Named
@SessionScoped
public class CampaignBean implements BaseBean<Campaign> {

    private Campaign campaign;

    @EJB
    private CampaignDaoImpl campaignDaoImpl;

    public Campaign getCampaign() {
        if (this.campaign == null) {
            campaign = new Campaign();
        }
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }




    public CampaignBean() {

    }

    public CampaignBean(Campaign campaign, CampaignDaoImpl campaingDaoImpl) {
        this.campaign = campaign;
        this.campaignDaoImpl = campaingDaoImpl;
    }

    @Override
    public void save() {
                
        this.campaignDaoImpl.create(this.getCampaign());
    }

    @Override
    public void delete(Long id) {
        this.campaignDaoImpl.remove(getCampaign());
    }

 
    @Override
    public List<Campaign> getList() {
        return this.campaignDaoImpl.findAll();

    }

    @Override
    public Campaign getById() {
     return  this.campaignDaoImpl.find(getCampaign().getId());
    }

}
