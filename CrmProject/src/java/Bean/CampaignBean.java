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
@Named
@SessionScoped
public class CampaignBean implements BaseBean<Object> {

    private Campaign campaign;

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

    public CampaignDaoImpl getCampaingDaoImpl() {
        if (this.campaignDaoImpl == null) {
            campaignDaoImpl = new CampaignDaoImpl();
        }
        return campaignDaoImpl;
    }

    public void setCampaingDaoImpl(CampaignDaoImpl campaingDaoImpl) {
        this.campaignDaoImpl = campaingDaoImpl;
    }

    public CampaignBean() {

    }

    public CampaignBean(Campaign campaign, CampaignDaoImpl campaingDaoImpl) {
        this.campaign = campaign;
        this.campaignDaoImpl = campaingDaoImpl;
    }

    @Override
    public void save() {

        this.getCampaingDaoImpl().create(this.getCampaign());
    }

    @Override
    public void delete() {
        this.getCampaingDaoImpl().deleteById(this.getCampaign(), this.getCampaign().getId());
    }

    @Override
    public Object getById() {
        return this.getCampaingDaoImpl().getByid(this.getCampaign(), this.getCampaign().getId());
    }

    @Override
    public List<Object> getList() {
        //return  this.getCampaingDaoImpl().getList(getCampaign());
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
