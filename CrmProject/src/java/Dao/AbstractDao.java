/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.DbConnect;
import Util.SqlGenerator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Util.DbConnect;



/**
 *
 * @author erayb
 */

public abstract class AbstractDao extends DbConnect{

    Connection connection;
    
    SqlGenerator generator;

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


}
    
