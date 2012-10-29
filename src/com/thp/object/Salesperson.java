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
        setSalesperson("","",0);
    }

    public Salesperson(String fn, String ln, long tel){
        setSalesperson(fn, ln, tel);
    }
    public void setSalesperson(String fn, String ln, long tel) {
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
    public long getPhone(){
        return person.phone;
    }  


}
