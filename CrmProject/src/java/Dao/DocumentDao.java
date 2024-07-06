package Dao;

import entity.Document;
import java.util.ArrayList;
import java.util.List;
import util.Connector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author gbara
 */
@Local
@Stateless
public class DocumentDao extends AbstractDao<Document> {

    private Connector connector;
    private Connection connection;

    @PersistenceContext(unitName = "CrmProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    // Default constructor required by EJB container
    public DocumentDao() {
        super(Document.class);
    }

    public List<Document> findAll() {
        List<Document> dList = new ArrayList<>();
        try {
            PreparedStatement pst = this.getConnection().prepareStatement("select * from document");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Document d = new Document();
                d.setId(rs.getLong("id"));
                d.setFilePath(rs.getString("path"));
                d.setFileName(rs.getString("name"));
                d.setFileType(rs.getString("type"));
                dList.add(d);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dList;
    }

    public Document insertDocument(Document document) {
        em.persist(document);
        em.flush();
        return document;
    }

    public Long insert(Document d) {
        long generatedId = -1;
        int affectedRows;
        String query = "insert into document(path,name,type) values(?,?,?)";
        try {
            PreparedStatement pst = this.getConnection().prepareStatement(
                    query, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, d.getFilePath());
            pst.setString(2, d.getFileName());
            pst.setString(3, d.getFileType());
            affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                ResultSet rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    generatedId = rs.getLong(1);
                }
                rs.close();
            }
            pst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return generatedId;
    }

    public Connector getConnector() {
        if (this.connector == null) {
            this.connector = new Connector();
        }
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Connection getConnection() {
        if (this.connection == null) {
            this.connection = this.getConnector().connect();
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
