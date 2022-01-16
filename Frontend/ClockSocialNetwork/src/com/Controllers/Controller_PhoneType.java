/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import java.sql.Connection;

/**
 *
 * @author Jonathan
 */
public class Controller_PhoneType extends ControllerF {

    public Controller_PhoneType() {
        if (connect == null) {//creates the connection to the database
            connect = (Connection) new DB_Connection().obtainConnection();

        }
        this.createFn = "{ ? = call packagefnnew.fnNewPhoneType(?)}";
        this.listComboFn = "{ ? = call packagefnlist.fnListPhoneTypeBasic}";
        this.listComboVariable = "nameType";
    }

}
