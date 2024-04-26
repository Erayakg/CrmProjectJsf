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
    
    public AbstractDao(SqlGenerator generator) {
        this.generator = generator;
        
    }    

    public void createEntity(){
        
                String sql=generator.returnCreateSql();
                connection=this.getConnect();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                       System.out.println(sql);
                    int result = preparedStatement.executeUpdate();
                       
                } catch (SQLException ex) {
                        System.out.println("error"+ex);
                }
    }


}
    
