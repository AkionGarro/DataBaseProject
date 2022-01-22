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
public class Controller_PaymentMethod extends ControllerF{
    public Controller_PaymentMethod(){
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
            this.createFn="{ ? = call packagefnnew.fnNewPaymentMethod(?)}";
            this.deleteFn="{ ? = call packagedeletetuple.fnDelPaymentMethod(?)}";
            this.updateFn="{ ? = call packageupdate.fnUpdtPaymentMethod(?,?)}";
            this.listComboFn="{ ? = call packagefnlist.fnListPayMethodBasic";
            this.listComboVariable="type";
    }
   
    
     public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListPayMethodBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[1];
            
            while(rs.next()){
                data[0]=rs.getString("type");
                table.addRow(data);
            }
            rs.close();
            cstmt.close();
            return table;
        }catch(Exception e){
            return null;
        }
    }
    
}
