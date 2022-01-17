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
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jonathan
 */
public class Controller_District{
    String deleteFn;
    public Controller_District() {
    
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
            this.deleteFn="{ ? = call packagedeleteTuple.fnDelDistrict(?,?,?)";
}
    
    
    
          
    public String create(String nameD, String nameCity, String country){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewDistrict(?,?,?)}");
            cstmt.setString(2, nameD);
            cstmt.setString(3, nameCity.trim());
            cstmt.setString(4, country.trim());
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
    public String deleteT(String param,String param2, String param3)
        {
        try{
            param=param.trim();
            CallableStatement cstmt = connect.prepareCall(deleteFn);
            cstmt.setString(2, param);
            cstmt.setString(3, param2);
            cstmt.setString(4, param3);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);//calls the function that returns a 1 if it was created or 0 it it was not
            cstmt.execute();
            
            String result;
            result = ((OracleCallableStatement)cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch(Exception e){
        return  e.toString();
        }
    }
    
    
        public ArrayList<String> listInfo(String nameCity, String nameCountry){
        try{
            ArrayList <String> listDistricts=new ArrayList<String>();



            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListDistrictBasic(?,?)}");
            cstmt.setString(2, nameCity);
            cstmt.setString(3, nameCountry);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            
            
            while(rs.next()){
                listDistricts.add(rs.getString("nameDistrict"));
            }
            return listDistricts;
        }catch(Exception e){
            return null;
        }
    }
}