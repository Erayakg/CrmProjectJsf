/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import entity.Document;
import java.util.ArrayList;
import java.util.List;
import util.Connector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author gbara
 */
public class DocumentDao {
    private Connector connector;
    private Connection connection;
    public List<Document> findAll(){
        List<Document> dList= new ArrayList<>();
        try{
            PreparedStatement pst=this.getConnection().prepareStatement("select * from document");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                Document d = new Document();
                d.setId(rs.getLong("id"));
                d.setFilePath(rs.getString("path"));
                d.setFileName(rs.getString("name"));
                d.setFileType(rs.getString("type"));
                dList.add(d);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return dList;
    }
    
    public void insert(Document d){
        String query="insert into document(path,name,type) values(?,?,?)";
        try{
            PreparedStatement pst=this.getConnection().prepareStatement(query);
            pst.setString(1, d.getFilePath());
            pst.setString(2, d.getFileName());
            pst.setString(3, d.getFileType());
            pst.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Connector getConnector() {
        if(this.connector==null)
            this.connector=new Connector();
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public Connection getConnection() {
        if(this.connection==null)
            this.connection=this.getConnector().connect();
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
            
    
}
