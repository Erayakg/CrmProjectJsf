/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Notes;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author furka
 */
public class NotesDaoImpl extends AbstractDao implements DaoOperation<Notes> {

    @Override
    public void createTable(Notes t) {
        try {
            super.createTableConn(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void create(Notes t) {
        try {
            super.createEntity(t);
        } catch (Exception ex) {
            System.out.println("error" + ex);
        }
    }

    @Override
    public void deleteById(Notes t, Long id) {
        super.delete(t, id);
    }

    @Override
    public List<Notes> getList() {
        List<Notes> noteslist = new ArrayList<>();
        try {
            List<Object[]> table = super.returnTable(new Notes());

            for (Object[] row : table) {
                noteslist.add(mapToObject(row));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NotesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noteslist;
    }

    @Override
    public Notes getByid(Notes t, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Notes mapToObject(Object[] row) {

        Notes notes = new Notes();
        notes.setId(((Number) row[0]).longValue());
        notes.setTitle((String) row[1]);
        notes.setContent((String) row[2]);
        return notes;
    }

    @Override
    public void update(Notes n,Long id) {
        try {
            super.updateDao(n, id);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NotesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
