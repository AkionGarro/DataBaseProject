/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import static com.Controllers.Controller_Main.connect;
/**
 *
 * @author Jonathan
 */
public class Controller_TypeClock extends ControllerF {
    
    
    public  Controller_TypeClock() {
        super();
        if (connect==null){ //connects to the database
            connect=(Connection) new DB_Connection().obtainConnection();
        }
       this.deleteFn ="{ ? = call packagedeleteTuple.fnDelTypeClock(?)}";
       this.createFn="{ ? = call packagefnnew.fnNewTypeClock(?,?)}";
       this.listComboVariable="nameType";
       this.listComboFn="{ ? = call packagefnlist.fnListTypeClockBasic}";
       this.updateFn="{ ? = call packageupdate.fnUpdtTypeClock(?,?)}";
    }
    
    //Returns array with information(typeClock) requested  from the database
    public DefaultTableModel listInfo(){
        try{
            DefaultTableModel table=new DefaultTableModel();

            table.addColumn("Name");

            table.addColumn("Description");

            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListTypeClockInfoBasic}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("nameType");
                data[1]=rs.getString("descriptionT");
                table.addRow(data);
            }
            rs.close();
            cstmt.close();
            return table;
        }catch(Exception e){
            return null;
        }
    }
    
    public String updateD(String nameType, String description){
        String backup=this.updateFn;
        this.updateFn="{ ? = call packageupdate.fnUpdtTypeClockDescription(?,?)}";
        String result=this.updateT(nameType, description);
        this.updateFn=backup;
        return result;
    }
    

}
