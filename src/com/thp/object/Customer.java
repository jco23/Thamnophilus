package com.thp.object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joanne Co
 */
public class Customer{
    Person person = new Person();
    int id;
    boolean type;
    String soldToAddress;
    String soldToCity;
    String soldToState;
    int soldToZipCode;
    String shipToAddress;
    String shipToCity;
    String shipTopState;
    int shipToZipCode;
    int fax;
    String email;
    String contactInfo;
    boolean preference;
    int discount;
    String termsCode;
    int taxRate;
    
    public Customer(){}
    public void setPerson(String fn, String ln, int tel){
        person.firstName = fn;
        person.lastName = ln;
        person.phone = tel;
    }
    public String getFirstName(){
        return person.firstName;
    }
    public String getLastName(){
        return person.lastName;
    }
    public int getPhone(){
        return person.phone;
    }
    
    
}
