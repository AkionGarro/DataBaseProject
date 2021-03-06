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
public class Controller_Gender extends ControllerF{
    public Controller_Gender(){
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
            this.createFn="{ ? = call packagefnnew.fnNewGender(?)}";
            this.listComboVariable="nameGender";
            this.listComboFn="{ ? = call packagefnlist.fnListGenderBasic}";
            this.deleteFn= "{ ? = call packagedeleteTuple.fnDelGender(?)}";
            this.updateFn="{ ? = call packageupdate.fnUpdtGender(?,?)}";
    }
    

    
}
