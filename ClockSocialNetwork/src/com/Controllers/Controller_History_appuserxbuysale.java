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
public class Controller_History_appuserxbuysale{
    public Controller_History_appuserxbuysale(){
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }
    

    public String create(String appuser, int idBuySale){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewHistory_AppuserxBuysale(?,?)}");
            cstmt.setString(2, appuser);
            cstmt.setInt(3, idBuySale);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);//calls the function that returns a 1 if it was created or 0 it it was not
            cstmt.execute();
            
            String result;
            result = ((OracleCallableStatement)cstmt).getString(1);
            System.out.println(result);
            return result;//if the tuple was created
           
        } catch(Exception e){
        return "Wrong data ";
        }
    }
    

    

}
