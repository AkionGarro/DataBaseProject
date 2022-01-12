/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controller;

import  com.Conecction.DB_Connection;
import java.sql.Connection;

/**
 *
 * @author Jonathan
 */
public class Controller_Main {
     public static Connection connect=null;
    public  Controller_Main(){
        if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
    }
}
