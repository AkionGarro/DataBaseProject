/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import static com.Controllers.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;

/**
 *
 * @author Jonathan
 */
public class ControllerF {
    protected String deleteFn;
    protected String createFn;
    protected String listComboFn;
    protected String listComboVariable;
    protected String listTableFirstColumn;
    protected String listTableSecondColum;
    public ControllerF() {
       
       
    }
    public String deleteT(String nameC)
        {
        try{
            nameC=nameC.trim();
            CallableStatement cstmt = connect.prepareCall(deleteFn);
            cstmt.setString(2, nameC);
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
    public String create(String nameD, String description){
        try{
            CallableStatement cstmt = connect.prepareCall(this.createFn);
            cstmt.setString(2, nameD.trim());
            cstmt.setString(3, description.trim());
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            String result;
            result = ((OracleCallableStatement)cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch(Exception e){
        return e.toString();
        }
    }
    
    public String create(String nameB){
        try{
            CallableStatement cstmt = connect.prepareCall(this.createFn);
            cstmt.setString(2, nameB.trim());
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
    
    
   public ArrayList<String> listInfoCombo(){
        try{
            ArrayList<String> myList=new ArrayList<String>();


            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall(listComboFn);

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[1];
            
            while(rs.next()){
                myList.add(rs.getString(listComboVariable));

            }
            return myList;
        }catch(Exception e){
            return null;
        }
    }
   
    public DefaultTableModel listInfoTable(String n){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall(listComboFn);

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[1];
            
            while(rs.next()){
                data[0]=rs.getString(this.listComboVariable);
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }

    
}
