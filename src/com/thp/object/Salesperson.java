/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

/**
 *
 * @author user
 */
public class Salesperson {

    int id;
    Person person = new Person();

    public Salesperson(){
        setSalesPerson("","","");
    }
    public Salesperson(String fn, String ln, String tel){
        setSalesPerson(fn, ln, tel);
    }
    
    public void setSalesPerson(String fn, String ln, String tel){
        person.setPerson(fn, ln, tel);
    }
    
    public void setId(int sid){
        id = sid;
    }
        
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return person.firstName;
    }
    public String getLastName(){
        return person.lastName;
    }
    public String getPhone(){
        return person.phone;
    }  
}
