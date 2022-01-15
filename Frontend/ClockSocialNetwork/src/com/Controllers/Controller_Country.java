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
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jonathan
 */
public class Controller_Country extends ControllerF {
    
    public Controller_Country() {
        super();
            if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
            
        }   
        this.createFn="{ ? = call packagefnnew.fnNewCountry(?,?)}";
        this.listComboFn="{ ? = call packagefnlist.fnListCountryInfoBasic}";
        this.listComboVariable="nameCountry";
        this.deleteFn= "{ ? = call packagedeleteTuple.fnDelCountry(?)}";
}

    public ArrayList<String> listCodeCombo(){
        ArrayList<String> listCodeCountry= new ArrayList<String>();
        String backupV=listComboVariable;
        listComboVariable="codecountry";
        listCodeCountry=listInfoCombo();
        listComboVariable=backupV;
        return listCodeCountry;
    }
}
