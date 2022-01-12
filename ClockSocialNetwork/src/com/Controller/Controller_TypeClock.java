/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

import com.Conecction.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import static com.Controller.Controller_Main.connect;
/**
 *
 * @author Jonathan
 */
public class Controller_TypeClock {
    
    
    public  Controller_TypeClock(){
        if (connect==null){ //connects to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }
    
    //Returns array with information(typeClock) requested  from the database
    public DefaultTableModel listTypeClock(){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("ID");

            table.addColumn("Name");

            table.addColumn("Description");

            CallableStatement cstmt= connect.prepareCall("{ ? = call fnListTypeClockBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[3];
            
            while(rs.next()){
                data[0]=String.valueOf(rs.getInt("idType"));
                data[1]=rs.getString("nameType");
                data[2]=rs.getString("descriptionT");
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }
    
        //Function that calls function fnNewTypeClock in the database
    public String create(String nameC, String descriptionC){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call fnNewTypeClock(?,?)}");
            cstmt.setString(2, nameC);
            cstmt.setString(3, descriptionC);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            
            String result;
            result = ((OracleCallableStatement)cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch(Exception e){
        return "Was not created";
        }
    }
    
}
