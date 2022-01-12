/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;


import com.Conecction.DB_Connection;
import static com.Controller.Controller_Main.connect;
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
public class Controller_BuyStatus {
    public  Controller_BuyStatus(){
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }


    public String create(String nameB,String descriptionB){
        try{
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewBuyStatus(?,?)}");
            cstmt.setString(2, nameB);
            cstmt.setString(3, descriptionB);
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
