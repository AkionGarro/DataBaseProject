/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jonathan
 */
public class DB_Connection {
    Connection conn=null;
    
    public DB_Connection(){
        openConnection();

    }
    private void openConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:dbprueba","pr","pr");
          if (conn!=null){
            System.out.println("Successfull connection");   
            } 
        }catch(SQLException| ClassNotFoundException ex){
                System.out.println("error");
                }
        
    }
    public  Connection obtainConnection(){
        return conn;
    }
    public void closeConnection(){

        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }
}


