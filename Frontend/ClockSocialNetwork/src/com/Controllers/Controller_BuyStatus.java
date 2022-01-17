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
public class Controller_BuyStatus extends ControllerF {
    public  Controller_BuyStatus(){
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.deleteFn="{ ? = call packagedeleteTuple.fnDelBuyStatus(?)}";
        this.createFn="{ ? = call packagefnnew.fnNewBuyStatus(?,?)}";
        this.listComboFn="{ ? = call packagefnlist.fnListBuyStatusComboBasic}";
        this.listComboVariable="status";
    }


   
     public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("Name");

            table.addColumn("Description");
            //calls function that returns the cursor
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListBuyStatusBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("status");
                data[1]=rs.getString("descriptionB");
                table.addRow(data);
            }
            //rs.close();
            return table;
        }catch(Exception e){
            
            return null;
        }
    }
     

}

