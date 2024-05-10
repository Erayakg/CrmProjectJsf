/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Campaign;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baran
 */
public class CampaignDaoImpl extends AbstractDao implements DaoOperation<Campaign> {

    @Override
    public void create(Campaign campaign) {
        try {

            super.createEntity(campaign);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Campaign t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<Campaign> getList() {
        List<Campaign> campaignList = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Campaign());

            for (Object[] row : table) {
                campaignList.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampaignDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return campaignList;
    }

    @Override
    public Campaign getByid(Campaign t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void createTable(Campaign t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    public static Campaign mapToObject(Object[] row) {
        Campaign campaign = new Campaign();
        campaign.setId(((Number) row[0]).longValue());
        campaign.setName((String) row[1]);
        campaign.setDescription((String) row[2]);
        campaign.setStartDate((LocalDateTime) row[3]);
        campaign.setEndDate((LocalDateTime) row[4]);
        campaign.setIsActive((Boolean) row[5]);
        return campaign;
    }

    @Override
    public void update(Long id) {
        Campaign campaign= new Campaign();
        campaign=this.getByid(campaign, id);
        try {
            super.update(campaign, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CampaignDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
