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
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author Jonathan
 */
public class Controller_Brand extends ControllerF{

    public  Controller_Brand(){
        super();
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.deleteFn="{ ? = call packagedeleteTuple.fnDelBrand(?)}";
        this.createFn="{ ? = call packagefnnew.fnNewBrand(?,?)}";
    }
    //returns array with the list of conditions from database sysrefcursor
    public ArrayList<String> listInfo(){
        try{
            ArrayList<String> myList=new ArrayList<String>();


            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListBrandBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[1];
            
            while(rs.next()){
                myList.add(rs.getString("nameBrand"));

            }
            return myList;
        }catch(Exception e){
            return null;
        }
    }
   public DefaultTableModel listInfoFull(){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");
            table.addColumn("Brand");
            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListBrandFull}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("nameBrand");
                data[1]=rs.getString("type");
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }

    
    
    
}
