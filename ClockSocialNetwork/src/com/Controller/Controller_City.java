/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

import com.Conecction.DB_Connection;
import static com.Controller.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author Jonathan
 */
public class Controller_City {
    public Controller_City() {
    
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
}
    
    
    

            
    public String create(String nameCity, String nameCountry){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewCity(?,?)}");
            cstmt.setString(2, nameCity);
            cstmt.setString(3, nameCountry);
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
