/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.DbConnect;
import Util.SqlGenerator;
import constant.SqlConnConstant;
import jakarta.ejb.EJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author erayb
 */

public abstract class BaseAbstractDao <T> extends DbConnect{

    
    private T instance;
    
    Connection connection;
   
    SqlGenerator<T> generator;
    
    
    public BaseAbstractDao(SqlGenerator<T> generator) {
        this.generator = generator;
    }    
    
    

    public void createEntity(){
        
                String sql=generator.returnCreateSql();
                connection=this.getConnect();

                try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                    int result = preparedStatement.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(BaseAbstractDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
main
    
