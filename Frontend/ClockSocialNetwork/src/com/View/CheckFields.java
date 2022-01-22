/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author garroakion
 */
public class CheckFields {

    public static boolean CheckEmail(String email) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    public static boolean onlyCheckNumbers(String str) {

        String regex = "[0-9]+";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();
    }

    // digit + lowercase char + uppercase char + punctuation + symbol
    public static boolean isValidPassword(String password) {
        String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{5,15}$";

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
