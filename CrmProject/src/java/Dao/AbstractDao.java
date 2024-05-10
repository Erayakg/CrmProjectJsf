/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.SqlGenerator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Util.DbConnect;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSetMetaData;



/**
 *
 * @author erayb
 */
public abstract class AbstractDao extends DbConnect {

    Connection connection;

    SqlGenerator generator;

    public Connection getConnection() {
        if(this.connection==null){
            return super.getConnect();
        }
        return connection;
    }
    
    
     
    public void createTableConn(Object o) throws Exception{
        
                generator=new SqlGenerator(o);
                
                String sql=generator.returnCreateSql();
                
                connection=this.getConnect();
                Statement st =getConnection().createStatement();
        
                ResultSet rs =st.executeQuery(sql);
                
    }

    public void createEntity(Object o) throws Exception {

        generator = new SqlGenerator(o);

        String sql = generator.returnInsertSql();

        connection = this.getConnect();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println(sql);
            int result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                       System.out.println(sql);
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                } catch (SQLException ex) {
                        System.out.println("error"+ex);
                }
    }
     
 

    public void delete(Object o, Long id) {

        generator = new SqlGenerator(o);

        String sql = generator.returnDeleteSql(id);

        connection = this.getConnect();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            System.out.println(sql);
            int result = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException ex) {
            System.out.println("error" + ex);
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
            connection.close();
        }
    }
    return table;
}

    
    
    public  Object returnObjectById(Object o ,long  id)throws SQLException{
        Object object=null;
        
        connection=this.getConnect();
        generator= new SqlGenerator(object);
        String sql = generator.returnSelectByIdSql(id);
        
        
        Statement st =getConnection().createStatement();
        
        ResultSet rs =st.executeQuery(sql);
        object=rs.getObject(1);
        System.out.println(object.toString());
        
        return  object;
        
        
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
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(object);
        return object;
    }

    return object;
    }*/
}
