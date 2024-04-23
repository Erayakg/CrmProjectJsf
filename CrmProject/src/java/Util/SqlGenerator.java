/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import jakarta.ejb.Stateless;
import java.lang.reflect.Field;

/**
 *
 * @author erayb
 */
@Stateless
public class SqlGenerator <T> {
    
    private T instance;
        
    public SqlGenerator(T instance) {
        
        this.instance = instance;
    }
 
     private String getType(Class<?> type) {

        if (type == String.class) {
            return "VARCHAR(255)";
        } else if (type == int.class || type == Integer.class) {
            return "INT";
        } else if (type == double.class || type == Double.class) {
            return "DOUBLE";
        } else if (type == float.class || type == Float.class) {
            return "FLOAT";
        } else if (type == boolean.class || type == Boolean.class) {
            return "BOOLEAN";
        } else {
            return "error";
        }
    }
 
    public String returnInsertSql() throws Exception {

        System.out.println(instance.getClass().getName());

        Field[] fields = instance.getClass().getDeclaredFields();

        String sql = "INSERT INTO " + instance.getClass().getName() + " (";
        String values = "VALUES (";

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sql += fields[i].getName();
            values += "'" + fields[i].get(instance) + "'";
            if (i < fields.length - 1) {
                sql += ", ";
                values += ", ";
            }
        }
        sql += ") " + values + ")";
        System.out.println(sql);
        return sql;
    }
    
    public String returnCreateSql() {
        System.out.println(instance.getClass().getName());

        Field[] fields = instance.getClass().getDeclaredFields();

        String sql = "CREATE TABLE " + instance.getClass().getName()+ " (";

        for (int i = 0; i < fields.length; i++) {
            sql += fields[i].getName() + " " + getType(fields[i].getType());
            if (i < fields.length - 1) {
                sql += ", ";
            }
        }

        sql += ")";

        System.out.println(sql);
        return sql;
        
    }
    
}
