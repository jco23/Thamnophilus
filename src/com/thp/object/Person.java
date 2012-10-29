package com.thp.object;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joanne Co
 */
public class Person {
    String firstName;
    String lastName;
    
    public Person(){
        setPerson("","");
    }
    public Person(String fn, String ln){
        setPerson(fn, ln);
    }
    public void setPerson(String fn, String ln){
        firstName=fn;
        lastName=ln;
    }
    
    public String getFirstName(){
        return firstName; 
    }
    
    public String getLastName(){
        return lastName;
    }
    
}
