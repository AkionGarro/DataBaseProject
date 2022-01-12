/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Model;

import javax.swing.text.PlainDocument;
import java.awt.*;
import javax.swing.text.*;

/**
 *
 * @author Jonathan
 */
public class JTextFieldLimit extends PlainDocument {
   private int limit;
   public JTextFieldLimit(int limit) {
      super();
      this.limit = limit;
   }
  public JTextFieldLimit(int limit, boolean upper) {
      super();
      this.limit = limit;
   }
   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
      if (str == null)
         return;
      if ((getLength() + str.length()) <= limit) {
         super.insertString(offset, str, attr);
      }
   }
}
