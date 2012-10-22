/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package valueObjects;
import java.util.*;
/**
 *
 * @author Mark Ma
 */
public class payment {
    int invoiceId;
   double amountPaid;
    String paymentDate;
    public payment(int invId, double amtPaid, String date)
    {
        invoiceId = invId;
        amountPaid = amtPaid; 
        paymentDate = date;
    }
    
    public static String recordPayment(payment pment)
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
