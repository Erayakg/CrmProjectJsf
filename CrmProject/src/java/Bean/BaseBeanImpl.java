/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.DaoOperation;
import entity.BaseEntity;
import java.util.List;

/**
 *
 * @author baran
 */
public abstract class BaseBeanImpl implements BaseBean<DaoOperation, BaseEntity> {

    @Override
    public void save(DaoOperation dao, BaseEntity entity) {
        dao.create(entity);
    }

    @Override
    public void delete(DaoOperation dao, BaseEntity entity) {
        dao.deleteById(entity, entity.getId());

    }

    @Override
   public BaseEntity getById(DaoOperation dao, BaseEntity entity){
     return (BaseEntity) dao.getByid(entity, entity.getId());
   }

    @Override
    public List<BaseEntity> getList(DaoOperation dao, BaseEntity entity) {
        return dao.getList(entity);
    }

}
