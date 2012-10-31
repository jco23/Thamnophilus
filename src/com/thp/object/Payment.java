/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Mark Ma
 */
public class Payment {
    int paymentID;
    int invoiceID;
    double amountPaid;
    Date paymentDate;
    public void setPaymentID(int pid)
    {
        paymentID = pid;
    }
    public int getPaymentID()
    {
        return paymentID;
    }
    public void setInvoiceID(int invid)
    {
        invoiceID = invid;
    }
    public int getInvoiceID()
    {
        return invoiceID;
    }
    public void setAmt(int amt)
    {
        amountPaid = amt;
    }
    public double getAmt()
    {
        return amountPaid;
    }
    public void setDate(String pdate)
    {
       try {  
              DateFormat formatter ;  
              formatter = new SimpleDateFormat("dd-MMM-yy");
              paymentDate = (Date)formatter.parse(pdate);  
 
       } catch (Exception e)
                {System.out.println("Exception :"+e);  }  
    }
    public Date getDate()
    {
        return paymentDate;
    }
}
