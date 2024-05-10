/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.lang.reflect.Field;
import java.lang.Long;
import java.time.LocalDateTime;

/**
 *
 * @author erayb
 */
public class SqlGenerator<T> {

    private T instance;

    public SqlGenerator(T instance) {

        this.instance = instance;
    }

    private String getType(Class<?> type) {
        if (type == String.class) {
            return "VARCHAR(255)";
        } else if (type == int.class || type == Integer.class || type == Long.class) {
            return "INT";
        } else if (type == double.class || type == Double.class) {
            return "DOUBLE";
        } else if (type == float.class || type == Float.class) {
            return "FLOAT";
        } else if (type == boolean.class || type == Boolean.class) {
            return "BOOLEAN";
        } else if (type == LocalDateTime.class) {
            return "TIMESTAMP";
        } else {
            return "error";
        }
    }

    public String returnInsertSql() throws IllegalAccessException {
        System.out.println(instance.getClass().getName());

        Field[] fields = instance.getClass().getDeclaredFields();

        StringBuilder sql = new StringBuilder("INSERT INTO " + instance.getClass().getSimpleName() + " (");
        StringBuilder values = new StringBuilder("VALUES (");
        boolean first = true;

        for (Field field : fields) {
            field.setAccessible(true);
            if (!"id".equals(field.getName())) { // id alanını dışarıda bırak
                if (!first) {
                    sql.append(", ");
                    values.append(", ");
                }
                sql.append(field.getName());
                Object value = field.get(instance);
                if (value == null) {
                    values.append("null"); // null değerleri doğru bir şekilde ekle
                } else {
                    values.append("'" + value + "'");
                }
                first = false;
            }
        }

        sql.append(") ").append(values).append(")");
        System.out.println(sql.toString());
        return sql.toString();
    }

    public String returnCreateSql() {
        System.out.println(instance.getClass().getName());
        Field[] fields = instance.getClass().getDeclaredFields();

        StringBuilder sql = new StringBuilder("CREATE TABLE " + instance.getClass().getSimpleName() + " (");
        boolean isFirst = true;

        for (Field field : fields) {
            field.setAccessible(true);
            if (!isFirst) {
                sql.append(", ");
            }
            if ("id".equals(field.getName())) {
                sql.append(field.getName() + " SERIAL PRIMARY KEY");
            } else {
                sql.append(field.getName() + " " + getType(field.getType()));
            }
            isFirst = false; // İlk alan işlendi, artık false yap
        }

        sql.append(")");

        System.out.println(sql.toString());
        return sql.toString();
    }

    public String returnSelectSql() {

        System.out.println(instance.getClass().getSimpleName());

        Field[] fields = instance.getClass().getDeclaredFields();

        String sql = "SELECT ";

        for (int i = 0; i < fields.length; i++) {
            sql += fields[i].getName();
            if (i < fields.length - 1) {
                sql += ", ";
            }
        }

        sql += " FROM " + instance.getClass().getSimpleName();
        System.out.println(sql);
        return sql;

    }

    public String returnDeleteSql(long id) {

        System.out.println(instance.getClass().getName());

        String sql = "DELETE FROM " + instance.getClass().getSimpleName() + " WHERE id = " + id;
        System.out.println(sql);

        return sql;
    }

    public String returnSelectByIdSql(long id) {

        System.out.println(instance.getClass().getName());

        String sql = "SELECT * FROM " + instance.getClass().getSimpleName() + " WHERE id = " + id;
        System.out.println(sql);

        return sql;

    }

}
