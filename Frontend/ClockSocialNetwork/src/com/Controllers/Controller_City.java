/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author Jonathan
 */
public class Controller_City extends  ControllerF{
    public Controller_City() {
    
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
            this.createFn="{ ? = call packagefnnew.fnNewCity(?,?)}";
            this.listComboVariable="nameCity";
           
}
    
    
    

            

   public ArrayList<String> listInfo(String nameCountry){
        try{
            ArrayList <String> listCity=new ArrayList<String>();



            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListCityBasic(?)}");
            cstmt.setString(2, nameCountry);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            
            
            while(rs.next()){
                listCity.add(rs.getString("nameCity"));
                
            }
            return listCity;
        }catch(Exception e){
            return null;
        }
    }
    
    
}
