/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bean;

import Dao.NotesDaoImpl;
import entity.Note;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author furka
 */
@Named
@SessionScoped
public class NotesBean implements BaseBean<Note> {

    private Note notes;
    @EJB
    private NotesDaoImpl notesDaoImpl;

    public Note getNotes() {
        if (this.notes == null) {
            notes = new Note();
        }
        return notes;
    }

    public void setNote(Note notes) {
        this.notes = notes;
    }



    public NotesBean() {

    }

    public NotesBean(Note notes, NotesDaoImpl notesDaoImpl) {
        this.notes = notes;
        this.notesDaoImpl = notesDaoImpl;
    }

    @Override
    public void save() {

        this.notesDaoImpl.create(this.getNotes());
    }

    @Override
    public void delete(Long id) {
        this.notesDaoImpl.remove(this.getNotes());
    }

    @Override
    public Note getById() {
        return this.notesDaoImpl.find(getNotes().getId());
    }

    @Override
    public List<Note> getList() {
        return this.notesDaoImpl.findAll();
    }
}
