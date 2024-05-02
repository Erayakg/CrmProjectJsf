/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
import java.util.List;

/**
 *
 * @author baran
 */
public interface BaseBean<Dao, Entity> {

    public void save(Dao dao, Entity entity);

    public void delete(Dao dao, Entity entity);

    public Entity getById(Dao dao, Entity entity);

    public List<Entity> getList(Dao dao, Entity entity);
}
