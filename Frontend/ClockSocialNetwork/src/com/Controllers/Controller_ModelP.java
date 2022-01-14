/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import static com.Controllers.Controller_Main.connect;
/**
 *
 * @author Jonathan
 */
public class Controller_ModelP extends ControllerF{

    public Controller_ModelP() {
                if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.createFn="{ ? = call packagefnnew.fnNewmodelp(?,?)}";
        this.listComboVariable="nameModel";
        this.listComboFn="{ ? = call packagefnlist.fnListModelPBasic(?)}";
    
    }

}
