/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import static com.Controllers.Controller_Main.connect;
/**
 *
 * @author Jonathan
 */
public class Controller_District {
    public Controller_District() {
    
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
}
    
    
    
            
    public String create(String nameD, String nameCity, String country){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewDistrict(?,?,?)}");
            cstmt.setString(2, nameD);
            cstmt.setString(3, nameCity);
            cstmt.setString(4, country);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            String result;
            result = ((OracleCallableStatement)cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch(Exception e){
        return "Wrong data, was not created";
        }
    }
}