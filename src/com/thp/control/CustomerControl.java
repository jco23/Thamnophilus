/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.createCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Customer;
import com.thp.object.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class CustomerControl {
    CustomerControl(){
        
    }
    public static Customer getCustomer(Customer cust){
        AccountDB db = new AccountDB();
        try {
            db.openDB();
            Statement stmt = db.conn.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT * FROM APP.DEPARTMENT");
            
            while (rs.next()) {
               cust.setPerson(rs.getString("NAME"), rs.getString("ID"), 12345678);
            }
            rs.close();
            
            db.closeDB();
        } catch (SQLException ex) {
            Logger.getLogger(createCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cust;
    }
    
    public static void createCustomer(){}
    public static void editCustomer(){}
    public static void searchCustomer(){}
}
