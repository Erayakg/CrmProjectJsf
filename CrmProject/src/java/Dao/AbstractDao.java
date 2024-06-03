package Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public abstract class AbstractDao<T> {

    private Class<T> entityClass;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        Query query = getEntityManager().createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e");
        return query.getResultList();
    }

    public List<T> findRange(int[] range) {
        Query query = getEntityManager().createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e");
        query.setMaxResults(range[1] - range[0] + 1);
        query.setFirstResult(range[0]);
        return query.getResultList();
    }
    public int count() {
        Query query = getEntityManager().createQuery("SELECT COUNT(e) FROM " + entityClass.getSimpleName() + " e");
        return ((Long) query.getSingleResult()).intValue();
    }
}
