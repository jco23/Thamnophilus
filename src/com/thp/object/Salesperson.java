/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thp.object;

/**
 *
 * @author user
 */
public class Salesperson extends Person{

    int id;
    long phone;

    public Salesperson(){
        setSalesperson("","",0);
    }

    public Salesperson(String fn, String ln, long tel){
        setPerson(fn, ln);
        setPhone(tel);
    }
    public void setSalesperson(String fn, String ln, long tel) {
        setPerson(fn, ln);
    }

    
    public void setId(int sid){
        id = sid;
    }
    public void setPhone(long tel){
        phone = tel;
    }
    public int getId(){
        return id;
    }

    public long getPhone(){
        return phone;
    }  


}
