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
public class Controller_Country extends ControllerF {
    
    public Controller_Country() {
        super();
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
            
        }   
        this.createFn="{ ? = call packagefnnew.fnNewCountry(?,?)}";
}

    
    /*public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListCountryInfoBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[1];
            
            while(rs.next()){
                data[0]=rs.getString("nameBrand");
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }   */
   

    public ArrayList<String> listInfo(){
        try{
            ArrayList <String> listDistricts=new ArrayList<String>();



            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListCountryBasic}");
            
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            
            
            while(rs.next()){
                listDistricts.add(rs.getString("nameCountry"));
            }
            return listDistricts;
        }catch(Exception e){
            return null;
        }
    }
}
