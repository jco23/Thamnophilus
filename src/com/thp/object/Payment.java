/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;
import java.util.*;
/**
 *
 * @author Mark Ma
 */
public class Payment {
    int invoiceId;
   double amountPaid;
    String paymentDate;
    public Payment(int invId, double amtPaid, String date)
    {
        invoiceId = invId;
        amountPaid = amtPaid; 
        paymentDate = date;
    }
    
    public static String recordPayment(Payment pment)
    {
       boolean success = true; 
       String status;
       if(success == true) {
            status = "Successful";
        }     
       else {
            status = "Fail!";
        }
       return status;
    }
    
}
