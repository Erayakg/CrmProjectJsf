/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.SqlGenerator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Util.DbConnect;
import jakarta.resource.cci.ResultSet;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author erayb
 */

 public abstract class AbstractDao extends DbConnect{

    Connection connection;
    
    SqlGenerator generator;
    
     
    public void createTableConn(Object o) throws Exception{
        
                generator=new SqlGenerator(o);
                
                String sql=generator.returnCreateSql();
                
                connection=this.getConnect();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                       System.out.println(sql);
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                } catch (SQLException ex) {
                        System.out.println("error"+ex);
                }
    }
     
    public void createEntity(Object o) throws Exception{
        
                generator=new SqlGenerator(o);
                
                String sql=generator.returnInsertSql();
                
                connection=this.getConnect();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                       System.out.println(sql);
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                } catch (SQLException ex) {
                        System.out.println("error"+ex);
                }
    }
     
    public void delete(Object o,Long id){
        
              generator=new SqlGenerator(o);
                
                String sql=generator.returnDeleteSql(id);
                
                connection=this.getConnect();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                       System.out.println(sql);
                    int result = preparedStatement.executeUpdate();
                    preparedStatement.close();
                } catch (SQLException ex) {
                        System.out.println("error"+ex);
                }
        } 
    
         public List<Object[]> returnTable(Object obj) {
             
            List<Object[]> table = new ArrayList<>();
            
            connection=this.getConnect();

            try {
                
                generator = new SqlGenerator(obj);
                
                String sql = generator.returnSelectSql();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    
                    System.out.println(sql);
                    
                    ResultSet resultSet = (ResultSet) preparedStatement.executeQuery();
                    
                    while (resultSet.next()) {
                        int columnCount = resultSet.getMetaData().getColumnCount();
                        Object[] row = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            row[i - 1] = resultSet.getObject(i);
                        }
                        table.add(row);
                    }
                } catch (SQLException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            return table;
        }
         

       public Object returnObjectById(Object obj, Long id) {
           
    Object object = null;

    connection = this.getConnect();

    try {
        generator = new SqlGenerator(obj);

        
        String sql = generator.returnSelectByIdSql(id);

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            java.sql.ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                
                int columnCount = resultSet.getMetaData().getColumnCount();
                object = resultSet.getObject(1);
                
                 for (int i = 1; i <= columnCount; i++) {
                    String columnName = resultSet.getMetaData().getColumnName(i);
                    Object columnValue = resultSet.getObject(i);
                    System.out.println("Column: " + columnName + ", Value: " + columnValue);
                }
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    return object;
    }
}
    
