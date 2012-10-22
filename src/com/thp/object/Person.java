package com.thp.object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Person {
    String firstName;
    String lastName;
    int phone;
    
    public Person(){
        setPerson("","",0);
    };
    public Person(String fn, String ln, int tel){
        setPerson(fn, ln, tel);
    };
    public void setPerson(String fn, String ln, int tel){
        firstName=fn;
        lastName=ln;
        phone=tel;
    };
    
    public String getFirstName(){
        return firstName; 
    };
    
    public String getLastName(){
        return lastName;
    };
    
    public int getPhone(){
        return phone;
    };
}
