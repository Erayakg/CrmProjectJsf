/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import constant.SqlConnConstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author erayb
 */
public abstract class  DbConnect {
    
    private Connection connect;
    
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
