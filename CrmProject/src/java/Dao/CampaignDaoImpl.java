/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Campaign;
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
            return super.findAll();
    }

    @Override
    public Campaign getByid(Long id) {
        return super.find(id);
    }
}
