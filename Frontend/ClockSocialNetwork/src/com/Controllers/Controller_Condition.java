/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;


import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.CallableStatement;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import java.sql.ResultSet;
/**
 *
 * @author Jonathan
 */
public class Controller_Condition {
    public  Controller_Condition(){
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }

    //Function that calls function fnNewCondition in the database
    public String create(String nameC, String descriptionC){
        try{
            nameC=nameC.trim();
            descriptionC=descriptionC.trim();
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewCondition(?,?)}");
            cstmt.setString(2, nameC);
            cstmt.setString(3, descriptionC);
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
    public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("Name");

            table.addColumn("Description");
            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListConditionBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("nameCondition");
                data[1]=rs.getString("descriptionC");
                table.addRow(data);
            }
            //rs.close();
            return table;
        }catch(Exception e){
            
            return null;
        }
    }
    
}

