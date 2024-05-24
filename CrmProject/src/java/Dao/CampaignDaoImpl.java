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
public class CampaignDaoImpl extends AbstractDao<Campaign> implements DaoOperation<Campaign> {

    public CampaignDaoImpl() {
        super(Campaign.class);
    }

    @Override
    public void create(Campaign campaign) {
        try {
            super.saveJpa(campaign);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Campaign> getList() {
<<<<<<< HEAD
            return super.findAll();
=======
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
>>>>>>> fdc1e0db410be055e244031756276dbca2dbfaf0
    }

    @Override
    public Campaign getByid(Long id) {
        return super.find(id);
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
    public void update(Campaign c,Long id) {
        try {
            super.updateDao(c, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CampaignDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
