package com.Controllers;

import com.Connect.DB_Connection;
import static com.Controllers.Controller_Main.connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.internal.OracleTypes;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan
 */
public class Controller_BuySale extends ControllerF {

    public Controller_BuySale() {
        if (connect == null) {//creates the connection to the database
            connect = (Connection) new DB_Connection().obtainConnection();
        }

    }

    //users=userseller buys=buystatus for sale , not for sale
    public String create(String p_idModel,
            String p_idCondition,
            String p_descriptionClock,
            Date manufactureDate,
            String p_vintage, int p_price, String p_idUserS,
            String p_idBuyS, String p_idBrand) {
        try {
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnnew.fnNewClockBuySale(?,?,?,?,?,?,?,?,?)}");

            cstmt.setString(2, p_idModel);
            cstmt.setString(3, p_idCondition);
            cstmt.setString(4, p_descriptionClock.trim());
            cstmt.setDate(5, manufactureDate);
            cstmt.setString(6, "..");
            cstmt.setInt(7, p_price);
            cstmt.setString(8, p_idUserS);
            cstmt.setString(9, p_idBuyS);
            cstmt.setString(10, p_idBrand);
            cstmt.registerOutParameter(1, OracleTypes.VARCHAR);
            cstmt.execute();
            String result;
            result = ((OracleCallableStatement) cstmt).getString(1);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            return e.toString();
        }
    }

    public DefaultTableModel listMyClocks(String username) {
        try {
            DefaultTableModel table = new DefaultTableModel();

            table.addColumn("ID");
            table.addColumn("Type");
            table.addColumn("Brand");
            table.addColumn("Model");
            table.addColumn("Condition");
            table.addColumn("Manufacture date");
            table.addColumn("Description");
            table.addColumn("Price");
            table.addColumn("Status");
            //calls function that returns the list
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnlist.fnListMyClocks(?)}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, username);
            cstmt.execute();

            ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);

            String data[] = new String[9];

            while (rs.next()) {
                data[0] = Integer.toString(rs.getInt("idbuysale"));
                data[1] = rs.getString("nametype");
                data[2] = rs.getString("namebrand");
                data[3] = rs.getString("namemodel");
                data[4] = rs.getString("namecondition");
                data[5] = rs.getDate("manufacturedate").toString();
                data[6] = rs.getString("descriptionclock");
                data[7] = Integer.toString(rs.getInt("p"));
                data[8] = rs.getString("status");
                table.addRow(data);
            }
            //rs.close();
            return table;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public DefaultTableModel listClocksForSale() {
        try {
            DefaultTableModel table = new DefaultTableModel();

            table.addColumn("ID");
            table.addColumn("Posted");
            table.addColumn("By");
            table.addColumn("Type");
            table.addColumn("Brand");
            table.addColumn("Model");
            table.addColumn("Condition");
            table.addColumn("Manufacture Date");
            table.addColumn("Description");
            table.addColumn("Price");

            //calls function that returns the list
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnlist.fnListAllClocksFsell}");

            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);

            String data[] = new String[10];

            while (rs.next()) {
                data[0] = Integer.toString(rs.getInt("idbuysale"));
                data[1] = rs.getDate("datepost").toString();
                data[2] = rs.getString("username");
                data[3] = rs.getString("nametype");
                data[4] = rs.getString("namebrand");
                data[5] = rs.getString("namemodel");
                data[6] = rs.getString("namecondition");
                data[7] = rs.getDate("manufacturedate").toString();
                data[8] = rs.getString("descriptionclock");
                data[9] = Integer.toString(rs.getInt("price"));
                table.addRow(data);
            }
            rs.close();
            return table;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public DefaultTableModel listBoughtClocks(String username) {
        try {
            DefaultTableModel table = new DefaultTableModel();

            table.addColumn("ID");
            table.addColumn("Bought");
            table.addColumn("From");
            table.addColumn("Type");
            table.addColumn("Brand");
            table.addColumn("Model");
            table.addColumn("Condition");
            table.addColumn("Manufacture Date");
            table.addColumn("Description");
            table.addColumn("Price");
            table.addColumn("Payment Method");
            table.addColumn("Shipping Method");

            //calls function that returns the list
            CallableStatement cstmt = connect.prepareCall("{ ? = call packagefnlist.fnListBoughtClocks(?)}");
            cstmt.setString(2, username);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);

            String data[] = new String[12];

            while (rs.next()) {
                data[0] = Integer.toString(rs.getInt("idbuysale"));
                data[1] = rs.getDate("datesale").toString();
                data[2] = rs.getString("username");
                data[3] = rs.getString("nametype");
                data[4] = rs.getString("namebrand");
                data[5] = rs.getString("namemodel");
                data[6] = rs.getString("namecondition");
                data[7] = rs.getDate("manufacturedate").toString();
                data[8] = rs.getString("descriptionclock");
                data[9] = Integer.toString(rs.getInt("p"));
                data[10] = rs.getString("type");
                data[11] = rs.getString("namesm");
                table.addRow(data);
            }
            rs.close();
            return table;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public DefaultTableModel listClocksWithFilters(String p_condition, String p_type, String p_brand, String p_model, int price) {
        try {
            DefaultTableModel table = new DefaultTableModel();

            table.addColumn("ID");
            table.addColumn("Posted");
            table.addColumn("By");
            table.addColumn("Type");
            table.addColumn("Brand");
            table.addColumn("Model");
            table.addColumn("Condition");
            table.addColumn("Manufacture Date");
            table.addColumn("Description");
            table.addColumn("Price");

            //calls function that returns the list
            CallableStatement cstmt = connect.prepareCall("{ ? = call packageconsults.fngetClocksWithFilters(?,?,?,?,?)}");
            cstmt.setString(2, p_condition);
            cstmt.setString(3, p_type);
            cstmt.setString(4, p_brand);
            cstmt.setString(5, p_model);
            cstmt.setInt(6, price);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);

            cstmt.execute();

            ResultSet rs = ((OracleCallableStatement) cstmt).getCursor(1);

            String data[] = new String[10];

            while (rs.next()) {
                data[0] = Integer.toString(rs.getInt("idbuysale"));
                data[1] = rs.getDate("datepost").toString();
                data[2] = rs.getString("username");
                data[3] = rs.getString("nametype");
                data[4] = rs.getString("namebrand");
                data[5] = rs.getString("namemodel");
                data[6] = rs.getString("namecondition");
                data[7] = rs.getDate("manufacturedate").toString();
                data[8] = rs.getString("descriptionclock");
                data[9] = Integer.toString(rs.getInt("price"));
                table.addRow(data);
            }
            rs.close();
            cstmt.close();
            return table;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
    public String updateStatus( String idBuySale, String buyStatus){
        this.updateFn="{ ? = call packageupdate.fnUpdteBuysaleBuyS(?,?)}";
        return this.updateT(idBuySale, buyStatus);
    
    }
    
    
   public String updatePrice( String idBuySale, int price){
        this.updateFn="{ ? = call packageupdate.fnUpdteBuysalePrice(?,?)}";
        return this.updateT(idBuySale, price);
    
    }


}
