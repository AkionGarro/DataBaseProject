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
import java.sql.ResultSet;
import static com.Controllers.Controller_Main.connect;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jonathan
 */
public class Controller_UserType extends ControllerF {
      
    public Controller_UserType() {
        super();
                if (connect==null){//creates the connection to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
        this.deleteFn="{ ? = call packagedeleteTuple.fnDelUserType(?)}";
        this.createFn="{ ? = call packagefnnew.fnNewUserType(?,?)}";
    }
   
    
       public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Name");
            table.addColumn("Description");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListUserTypeBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("nameType");
                data[1]=rs.getString("descriptionType");
                table.addRow(data);
            }
            return table;
        }catch(Exception e){
            return null;
        }
    }

    

}
