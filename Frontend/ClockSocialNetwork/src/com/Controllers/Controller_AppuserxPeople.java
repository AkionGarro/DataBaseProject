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
import java.sql.ResultSet;
import com.View.User;
import java.util.HashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan
 */
public class Controller_AppuserxPeople extends ControllerF {
    public Controller_AppuserxPeople() {
        if (connect == null) {//creates the connection to the database
            connect = (Connection) new DB_Connection().obtainConnection();
        }
       
    }

    public String create(String p_identification,
            String p_idType,
            String p_idGender,
            String p_idCountry,
            Date p_birthdate,
            String p_name,
            String p_surname,
            String p_secondsurname,
            String p_username,
            String p_password,
            String p_Email,
            String p_district,
            String p_City,
            String p_addressCountry,
            String p_phoneNumber,
            String p_phoneCode,
            String p_phoneType
    ) {
        try {
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewPeopleappuser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(2, p_identification.trim());
            cstmt.setString(3, p_idType);
            cstmt.setString(4, p_idGender);
            cstmt.setString(5, p_idCountry);
            cstmt.setDate(6, p_birthdate);
            cstmt.setString(7, p_name.trim());
            cstmt.setString(8, p_surname.trim());
            cstmt.setString(9, p_secondsurname.trim());
            cstmt.setString(10, p_username);
            cstmt.setString(11, p_password);
            cstmt.setString(12, p_Email);
            cstmt.setString(13, p_district);
            cstmt.setString(14, p_City);
            cstmt.setString(15, p_addressCountry);
            cstmt.setInt(16, Integer.parseInt(p_phoneNumber));
            cstmt.setString(17, p_phoneCode);
            cstmt.setString(18, p_phoneType);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            String result;
            result = ((OracleCallableStatement) cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            return "Wrong data, was not created";
        }
    }

    public User getUser(String p_username) {
        User user = null;
        try {
            CallableStatement cstmt = connect.prepareCall("{ ? = call packageconsults.fngetUserInfo(?)}");
            cstmt.setString(2, p_username);

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet result;
            result = ((OracleCallableStatement) cstmt).getCursor(1);

            while (result.next()) {
                user = new User();
                user.setUsername(result.getString("username"));
                user.setUserType(result.getInt("usertype"));
                user.setPassword(result.getString("passworda"));
                user.setUserId(result.getInt("idappuser"));
                return user;
            }
            result.close();
            cstmt.close();

        } catch (Exception e) {
            return null;
        }
        return user;
    }
    public String updateUserType(String username, String userType){
     this.updateFn="{ ? = call packageupdate.fnUpdteChangeUserType(?,?)}";
     return this.updateT(username, userType); 
    }
       
    public DefaultTableModel listInfoTableType(){
        
        try{ 
            DefaultTableModel table=new DefaultTableModel();


            table.addColumn("Username");
            table.addColumn("Type");

            //calls function that returns the list
            CallableStatement cstmt= connect.prepareCall("{ ? = call packagefnlist.fnListUserWithType}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            
            String data[]= new  String[2];
            
            while(rs.next()){
                data[0]=rs.getString("username");
                data[1]=rs.getString("nametype");
                table.addRow(data);
            }
            rs.close();
            cstmt.close();
            return table;
        }catch(Exception e){
            System.out.println(e.toString());
         
            return null;
        }
    }

}
