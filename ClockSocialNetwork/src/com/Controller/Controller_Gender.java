/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

import com.Conecction.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import static com.Controller.Controller_Main.connect;
/**
 *
 * @author Jonathan
 */
public class Controller_Gender {
    public Controller_Gender(){
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }
    
        public String create(String nameB){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewBrand(?)}");
            cstmt.setString(2, nameB);
            
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);//calls the function that returns a 1 if it was created or 0 it it was not
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
