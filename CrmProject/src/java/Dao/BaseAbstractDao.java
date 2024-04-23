/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Util.SqlGenerator;
import constant.SqlConnConstant;
import jakarta.ejb.EJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author erayb
 */

public abstract class BaseAbstractDao implements DaoOperation<Object>{
    
    private Connection connect;
    
    @EJB
    SqlGenerator generator;
        
    public Connection getConnect() {
        if(this.connect==null){

            try{
                
                Class.forName(SqlConnConstant.JDBC_DRIVER);
                
                this.connect=DriverManager.getConnection(SqlConnConstant.Url,SqlConnConstant.userName,SqlConnConstant.Password);
                
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return connect;
    }
    
}
    
    
    
    
    

