/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Notes;
import java.util.List;

/**
 *
 * @author baran
 */
public class NotesDaoImpl extends AbstractDao<Notes> implements DaoOperation<Notes> {

    public NotesDaoImpl() {
        super(Notes.class);
    }

    @Override
    public void create(Notes notes) {
        try {
            super.saveJpa(notes);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Long id) {
        super.delete(id);
    }

    @Override
    public List<Notes> getList() {
        return super.findAll();
    }

    @Override
    public Notes getByid(Long id) {

        return super.find(id);
    }

}
