/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import java.sql.Date;

/**
 *
 * @author Jonathan
 */
public class Controller_BuySale {

    public Controller_BuySale() {
        if (connect == null) {//creates the connection to the database
            connect = (Connection) new DB_Connection().obtainConnection();
        }

    }

    //users=userseller buys=buystatus for sale , not for sale
    public String create(String p_idType, String p_idModel,
            String p_idCondition,
            String p_descriptionClock,
            Date manufactureDate,
            String p_vintage, int p_price, String p_idUserS,
            String p_idBuyS, String p_idBrand) {
        try {
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewClockBuySale(?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(2, p_idType);
            cstmt.setString(3, p_idModel);
            cstmt.setString(4, p_idCondition);
            cstmt.setString(5, p_descriptionClock);
            cstmt.setString(6, "");
            cstmt.setString(7, p_vintage);
            cstmt.setInt(8, p_price);
            cstmt.setString(9, p_idUserS);
            cstmt.setString(10, p_idBuyS);
            cstmt.setString(11, p_idBrand);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            String result;
            result = ((OracleCallableStatement) cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            return "Was not created";
        }
    }

}
