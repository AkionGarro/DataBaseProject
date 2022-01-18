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
public class Controller_ShippingMethod extends ControllerF {
    public  Controller_ShippingMethod(){
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.createFn="{ ? = call packagefnnew.fnNewShippingMethod(?,?)}";
        this.deleteFn="{ ? = call packagedeletetuple.fnDelShippingMethod(?,?)}";
        this.updateFn="{ ? = call packageupdate.fnUpdtShippingMethod(?,?,?)}";
        this.listComboFn="{ ? = call packagefnlist.fnListShippingMethodBasic}";
        this.listComboVariable="namesm";
    }
        public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("Name");

            table.addColumn("Company");

            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListShippingMethodInfoBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("namesm");
                data[1]=rs.getString("company");
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }

}
