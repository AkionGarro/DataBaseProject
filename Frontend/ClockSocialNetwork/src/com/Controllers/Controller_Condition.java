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
public class Controller_Condition extends ControllerF{
    public  Controller_Condition(){
        super();
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.deleteFn="{ ? = call packagedeleteTuple.fnDelCondition(?)}";
        this.createFn="{ ? = call packagefnnew.fnNewCondition(?,?)}";
        this.listComboFn="{ ? = call packagefnlist.fnListComboCondition}";
         this.listComboVariable="namecondition";
         this.updateFn="{ ? = call packageupdate.fnUpdtCondition(?,?)}";
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
            rs.close();
            cstmt.close();
            return table;
        }catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

}

