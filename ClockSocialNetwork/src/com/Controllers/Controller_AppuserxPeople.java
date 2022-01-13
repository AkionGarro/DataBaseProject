/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import java.sql.Date;
/**
 *
 * @author Jonathan
 */
public class Controller_AppuserxPeople {

    public Controller_AppuserxPeople() {
    if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
    }
    
    
    }

    
    public String create(String p_identification , 
                            String p_idType, 
                            String p_idGender , 
                            String p_idCountry ,
                            Date p_birthdate, 
                            String  p_name,
                            String  p_surname ,
                            String p_secondsurname ,
                            String p_username,  
                            String  p_district ,
		 	    String  p_password ,
			    String  p_Email ){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewPeopleappuser(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(2, p_identification);
            cstmt.setString(3, p_idType);
            cstmt.setString(4, p_idGender);
            cstmt.setString(5, p_idCountry);
            cstmt.setDate(6, p_birthdate);
            cstmt.setString(7, p_name);
            cstmt.setString(8, p_surname);
            cstmt.setString(9, p_secondsurname);
            cstmt.setString(10, p_username);
            cstmt.setString(11, p_district);
            cstmt.setString(12, p_password);
            cstmt.setString(13, p_Email);
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
