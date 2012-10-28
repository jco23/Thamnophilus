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
    public static final int MAX_NAME=35;
    public static final int MAX_PHONE=11;
    String firstName;
    String lastName;
    String phone;
    
    public Person(){
        setPerson("","","");
    }
    public Person(String fn, String ln, String tel){
        setPerson(fn, ln, tel);
    }
    public void setPerson(String fn, String ln, String tel){
        setFirstName(fn);
        setLastName(ln);
        setPhone(tel);
    }
    public void setFirstName(String fn){
	if(fn.length() > MAX_NAME)
	{
		System.out.println("First name exceeds max length. It will be truncated.");
		firstName=fn.substring(0, MAX_NAME);
	}
        else{
		firstName=fn;
        }
    }
    public void setLastName(String ln){
	if(ln.length() > MAX_NAME)
	{
		System.out.println("Last name exceeds max length. It will be truncated.");
		lastName=ln.substring(0, MAX_NAME);
	}
        else{
		lastName=ln;
        }  
    }
    public void setPhone(String tel){
    	if(tel.length() > MAX_PHONE)
	{
		System.out.println("Telephone exceeds max length. It will be truncated.");
		phone=tel.substring(0, MAX_PHONE);
	}
        else{
		phone=tel;
        } 
    }
    public String getFirstName(){
        return firstName; 
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getPhone(){
        return phone;
    }
}
