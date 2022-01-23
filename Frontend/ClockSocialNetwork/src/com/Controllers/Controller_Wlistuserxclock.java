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
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author Jonathan
 */
public class Controller_Wlistuserxclock extends ControllerF  {

    public Controller_Wlistuserxclock() {
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.createFn="{ ? = call packagefnnew.fnNewWlistUserxClock(?,?)}";
        this.deleteFn= "{ ? = call packagedeleteTuple.fnDelWlist(?,?)}";
            
    }
     
     public DefaultTableModel listFavoriteClocks(String username){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("ID");
            table.addColumn("Posted");
            table.addColumn("By");
            table.addColumn("Type");
            table.addColumn("Brand");
            table.addColumn("Model");
            table.addColumn("Condition");
            table.addColumn("Manufacture Date");
            table.addColumn("Description");
            table.addColumn("Price");
            
            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListFavorites(?)}");
            cstmt.setString(2, username);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[10];
            
            while(rs.next()){
                data[0]=Integer.toString(rs.getInt("idbuysale"));
                data[1]=rs.getDate("datepost").toString();
                data[2]=rs.getString("username");
                data[3]=rs.getString("nametype");
                data[4]=rs.getString("namebrand");
                data[5]=rs.getString("namemodel");
                data[6]=rs.getString("namecondition");
                data[7]=rs.getDate("manufacturedate").toString();
                data[8]=rs.getString("descriptionclock");
                data[9]=Integer.toString(rs.getInt("price"));
                 table.addRow(data);
            }
            rs.close();
            cstmt.close();
            return table;
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }


     
}
