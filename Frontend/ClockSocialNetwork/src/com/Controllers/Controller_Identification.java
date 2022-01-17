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
import java.util.ArrayList;
/**
 *
 * @author Jonathan
 */
public class Controller_Identification extends ControllerF {
    public Controller_Identification(){
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();

        }
            this.createFn="{ ? = call packagefnnew.fnNewIdentification(?)}";
            this.listComboFn="{ ? = call packagefnlist.fnListIdentification}";
            this.listComboVariable="typeid";
            this.deleteFn= "{ ? = call packagedeleteTuple.fnDelIdentification(?)}";
    }
    

        
        
        
        //missing correct implementation with buysale

       
       
   
}
