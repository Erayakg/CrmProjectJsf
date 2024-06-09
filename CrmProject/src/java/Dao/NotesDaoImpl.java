/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;



import entity.Note;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


/**
 *
 * @author baran
 */
@Stateless
public class NotesDaoImpl extends AbstractDao<Note>  {

       @PersistenceContext(unitName = "CrmProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotesDaoImpl() {
        super(Note.class);
    }

}
