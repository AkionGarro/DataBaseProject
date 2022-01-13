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
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jonathan
 */
public class Controller_Country {
    
    public Controller_Country() {
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }   
}
    
        public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListBrandBasic}");

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
