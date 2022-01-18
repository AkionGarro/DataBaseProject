package com.Model;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class Encoder {

    String Key = "ProjectEncoder";

    public String encode(String passwordToEncode) {
        String encodedPassword = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] passwordKey = md5.digest(Key.getBytes("utf-8"));
            byte[] bytes = Arrays.copyOf(passwordKey, 24);
            SecretKey key = new SecretKeySpec(bytes, "DESede");
            Cipher encryption = Cipher.getInstance("DESede");
            encryption.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = passwordToEncode.getBytes("utf-8");
            byte[] buffer = encryption.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buffer);
            encodedPassword = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error encode");
        }
        return encodedPassword;
    }

    public String decode(String encodePassword) {
        String decodePassword = "";
        try {
            byte[] message = Base64.decodeBase64(encodePassword.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(Key.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            decodePassword = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error decode");
        }
        return decodePassword;
    }
}
