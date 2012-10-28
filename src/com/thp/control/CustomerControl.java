/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.control;

import com.thp.boundary.CreateCustomerForm;
import com.thp.object.AccountDB;
import com.thp.object.Customer;
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
        try {
            AccountDB.openDB();
            Statement stmt = AccountDB.conn.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT * FROM APP.CUSTOMERS");
            
            while (rs.next()) {
               cust.setPerson(rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), "12345678");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cust;
    }
    
    public static void createCustomer(Customer cust){
        try {
            Statement stmt = AccountDB.conn.createStatement();  
            stmt.executeUpdate("INSERT INTO APP.CUSTOMERS (id, custtype, firstname, lastname) VALUES(5, 1, 'Dean', 'Chester')");
        } catch (SQLException ex) {
            Logger.getLogger(CreateCustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void editCustomer(){}
    public static void searchCustomer(){}
}
