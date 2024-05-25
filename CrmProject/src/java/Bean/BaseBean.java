/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;
import java.util.List;
import java.io.Serializable;


/**
 *
 * @author baran
 */
public interface BaseBean<Entity>  extends Serializable{

    public void save();

    public void delete(Long id);

    public Entity getById();

    public List<Entity> getList();
}
