/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.SqlGenerator;

import java.sql.Connection;
import java.sql.SQLException;

import Util.DbConnect;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import jakarta.transaction.UserTransaction;
import java.util.List;
import javax.naming.InitialContext;

<<<<<<< HEAD


public abstract class AbstractDao<T> extends DbConnect {
=======
/**
 *
 * @author erayb
 */
public abstract class AbstractDao extends DbConnect {
>>>>>>> fdc1e0db410be055e244031756276dbca2dbfaf0

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("CrmProjectPU");
    private Class<T> entityClass;

<<<<<<< HEAD
    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
=======
    SqlGenerator generator;

    public Connection getConnection() {
        if (this.connection == null) {
            return super.getConnect();
        }
        return connection;
    }

    public void createTableConn(Object o) throws Exception {

        generator = new SqlGenerator(o);

        String sql = generator.returnCreateSql();

        connection = this.getConnect();
        Statement st = getConnection().createStatement();

        ResultSet rs = st.executeQuery(sql);

>>>>>>> fdc1e0db410be055e244031756276dbca2dbfaf0
    }

    public void saveJpa(T entity) {
        EntityManager em = emf.createEntityManager();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            em.joinTransaction();
            em.persist(entity);

<<<<<<< HEAD
            transaction.commit();
=======
        String sql = generator.returnInsertSql();

        connection = this.getConnect();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println(sql);
            int result = preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
    }

    public void delete(Object o, Long id) {

        generator = new SqlGenerator(o);

        String sql = generator.returnDeleteSql(id);

        connection = this.getConnect();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println(sql);
            int result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
    }

    public void updateDao(Object o, Long id) throws IllegalAccessException {
        generator = new SqlGenerator(o);

        try {
            String sql = generator.returnUpdateSql(id);
            connection = this.getConnect();

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println(sql);
                int result = preparedStatement.executeUpdate();
                if (result > 0) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("Update failed");
                }
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("General Error: " + ex.getMessage());
        }
    }

    public List<Object[]> returnTable(Object obj) throws SQLException {

        List<Object[]> table = new ArrayList<>();
        Connection connection = null;
        try {
            connection = this.getConnect();
            SqlGenerator generator = new SqlGenerator(obj);
            String sql = generator.returnSelectSql();

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                table.add(row);
            }
        } finally {
            if (connection != null) {
            }
        }
        return table;
    }

    public Object returnObjectById(Object o, long id) throws SQLException {
        Object object = null;

        connection = this.getConnect();
        generator = new SqlGenerator(object);
        String sql = generator.returnSelectByIdSql(id);

        Statement st = getConnection().createStatement();

        ResultSet rs = st.executeQuery(sql);
        object = rs.getObject(1);
        System.out.println(object.toString());

        return object;

    }

    /* public Object returnObjectById(Object obj, Long id) throws SQLException {
           
        Object object = null;

        connection = this.getConnect();

            generator = new SqlGenerator(obj);
        
        String sql = generator.returnSelectByIdSql(id);

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();

                if (resultSet.next()) {
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    object = resultSet.getObject(1);
                }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            java.sql.ResultSet resultSet = preparedStatement.executeQuery();

                try {
                    if (resultSet.next()) {
                        
                        int columnCount = resultSet.getMetaData().getColumnCount();
                        object = resultSet.getObject(1);
                        
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = resultSet.getMetaData().getColumnName(i);
                            Object columnValue = resultSet.getObject(i);
                            System.out.println("Column: " + columnName + ", Value: " + columnValue);
                        }
                        
                        
                    }   } catch (SQLException ex1) {
                    Logger.getLogger(AbstractDao.class.getName()).log(Level.SEVERE, null, ex1);
                }
>>>>>>> fdc1e0db410be055e244031756276dbca2dbfaf0
        } catch (Exception e) {
            try {
                if (transaction != null) {
                    transaction.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public T find(Object id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(entityClass, id);
        } finally {
            em.close();
        }
    }

    public List<T> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        } finally {
            em.close();
        }
    }

    public void update(T entity) {
        EntityManager em = emf.createEntityManager();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            em.joinTransaction();
            em.merge(entity);

            transaction.commit();
        } catch (Exception e) {
            try {
                if (transaction != null) {
                    transaction.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void delete(Object id) {
        EntityManager em = emf.createEntityManager();
        UserTransaction transaction = null;
        try {
            transaction = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();

            em.joinTransaction();
            T entity = em.find(entityClass, id);
            if (entity != null) {
                em.remove(entity);
            }

            transaction.commit();
        } catch (Exception e) {
            try {
                if (transaction != null) {
                    transaction.rollback();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void close() {
        emf.close();
    }
}
