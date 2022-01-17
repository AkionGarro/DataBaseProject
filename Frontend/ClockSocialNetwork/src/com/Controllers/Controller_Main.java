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
    
    
     private Controller_Condition contCondition;
     private Controller_TypeClock contTypeClock;
     private Controller_Brand contBrand;
     private Controller_BuyStatus contBuyStatus;
     private Controller_UserType contUserType;
     private Controller_PaymentMethod contPaymentMethod;
     private Controller_Country contCountry;
     private Controller_City contCity;
     private Controller_District contDistrict;
     private Controller_ModelP contModelP;
     private Controller_Gender contGender;
     private Controller_ShippingMethod contShippingMethod;
     private Controller_Identification contIdentification;
     private Controller_AppuserxPeople contAppuserPeople;
     private Controller_PhoneType contPhoneType;
     private Controller_BuySale contBuySale;
     
     public static Connection connect=(Connection) new DB_Connection().obtainConnection(); 
     private static Controller_Main mainController= new Controller_Main();
     
     
    private String username="GarroAkion";
     
    
     
    public  Controller_Main(){
      //  if (connect==null){//creates the connection to the database
        //    connect=(Connection) new DB_Connection().obtainConnection();
        //}
       contCondition= new Controller_Condition();
       contTypeClock= new Controller_TypeClock();
       contBrand= new Controller_Brand();
       contBuyStatus=new Controller_BuyStatus();
       contUserType=new Controller_UserType();
       contPaymentMethod=new Controller_PaymentMethod();
       contCountry=new Controller_Country();
       contCity=new Controller_City();
       contDistrict=new Controller_District();
       contModelP=new Controller_ModelP();
       contGender=new Controller_Gender();
       contAppuserPeople=new Controller_AppuserxPeople();
       contShippingMethod= new Controller_ShippingMethod();
       contIdentification=new Controller_Identification();
       contPhoneType=new Controller_PhoneType();
       contBuySale=new Controller_BuySale();
       
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

    public Controller_Gender getContGender() {
        return contGender;
    }


    
    
    public Controller_Condition getContCondition(){
     return contCondition;
    }
    public Controller_TypeClock getContTypeClock(){
     return contTypeClock;
    }

    public Controller_Brand getContBrand() {
        return contBrand;
    }

    public Controller_UserType getContUserType() {
        return contUserType;
    }
    
    
    public static Controller_Main getContMain(){
    return  mainController;
    }

    public Controller_BuyStatus getContBuyStatus() {
        return contBuyStatus;
    }

    public Controller_ShippingMethod getContShippingMethod() {
        return contShippingMethod;
    }

    public Controller_PaymentMethod getContPaymentMethod() {
        return contPaymentMethod;
    }
  
    
    public void createWindowMessage(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Info for " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public Controller_ModelP getContModelP() {
        return this.contModelP;
        
    }

    public Controller_AppuserxPeople getContAppUserPeople() {
        return contAppuserPeople;
    }


    public Controller_Identification getContIdentification(){
        return contIdentification;
    }

    public Controller_AppuserxPeople getContAppuserPeople() {
        return contAppuserPeople;
    }

    public Controller_PhoneType getContPhoneType() {
        return contPhoneType;
    }

    public Controller_BuySale getContBuySale() {
        return contBuySale;
    }

    public String getUsername() {
        return username;
    }
}
