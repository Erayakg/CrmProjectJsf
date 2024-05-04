/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.NotesDaoImpl;
import entity.Notes;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class NotesBean implements BaseBean<Notes> {

    private Notes notes;

    private NotesDaoImpl notesDaoImpl;

    public Notes getNotes() {
        if (this.notes == null) {
            notes = new Notes();
        }
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public NotesDaoImpl getCampaingDaoImpl() {
        if (this.notesDaoImpl == null) {
            notesDaoImpl = new NotesDaoImpl();
        }
        return notesDaoImpl;
    }

    public void setCampaingDaoImpl(NotesDaoImpl notesDaoImpl) {
        this.notesDaoImpl = notesDaoImpl;
    }

    public NotesBean() {

    }

    public NotesBean(Notes notes, NotesDaoImpl notesDaoImpl) {
        this.notes = notes;
        this.notesDaoImpl = notesDaoImpl;
    }

    @Override
    public void save() {

        this.notesDaoImpl.create(this.getNotes());
    }

    @Override
    public void delete() {
        this.notesDaoImpl.deleteById(this.getNotes(), getNotes().getId());
    }

    @Override
    public Notes getById() {
        return this.notesDaoImpl.getByid(this.getNotes(), getNotes().getId());
    }

    @Override
    public List<Notes> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
