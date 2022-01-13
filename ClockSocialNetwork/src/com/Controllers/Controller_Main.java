/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Controllers;

import com.Connect.DB_Connection;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Controller_Main {

    public static Connection connect = null;
    private static Controller_Main mainController = new Controller_Main();
    private Controller_Condition contCondition;
    private Controller_TypeClock contTypeClock;
    private Controller_Brand contBrand;
    private Controller_BuyStatus contBuyStatus;
    private Controller_UserType contUserType;
    private Controller_Country contCountry;
    private Controller_City contCity;
    private Controller_District contDistrict;
    private Controller_Identification contIdentification;
    private Controller_ShippingMethod contShippingMethod;
    private Controller_PaymentMethod contPaymentMethod;
    private Controller_ModelP contModel;
    private Controller_Gender contGender;

    public Controller_Main() {
        if (connect == null) {//creates the connection to the database
            connect = (Connection) new DB_Connection().obtainConnection();
        }
        contCondition = new Controller_Condition();
        contTypeClock = new Controller_TypeClock();
        contBrand = new Controller_Brand();
        contBuyStatus = new Controller_BuyStatus();
        contUserType = new Controller_UserType();
        contCountry = new Controller_Country();
        contCity = new Controller_City();
        contDistrict = new Controller_District();

        contIdentification = new Controller_Identification();
        contShippingMethod = new Controller_ShippingMethod();
        contPaymentMethod = new Controller_PaymentMethod();
        contModel = new Controller_ModelP();
        contGender = new Controller_Gender();
    }

    public Controller_Condition getContCondition() {
        return contCondition;
    }

    public Controller_TypeClock getContTypeClock() {
        return contTypeClock;
    }

    public Controller_Brand getContBrand() {
        return contBrand;
    }

    public Controller_UserType getContUserType() {
        return contUserType;
    }

    public static Controller_Main getContMain() {
        return mainController;
    }

    public Controller_BuyStatus getContBuyStatus() {
        return contBuyStatus;
    }

    public Controller_Country getContCountry() {
        return contCountry;
    }

    public Controller_City getContCity() {
        return contCity;
    }

    public Controller_District getContDistrict() {
        return contDistrict;
    }

    public Controller_Identification getContIdentification() {
        return contIdentification;
    }

    public Controller_ShippingMethod getContShippingMethod() {
        return contShippingMethod;
    }

    public Controller_PaymentMethod getContPaymentMethod() {
        return contPaymentMethod;
    }

    public Controller_ModelP getContModel() {
        return contModel;
    }

    public Controller_Gender getContGender() {
        return contGender;
    }

    
    public void createWindowMessage(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "Info for " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
