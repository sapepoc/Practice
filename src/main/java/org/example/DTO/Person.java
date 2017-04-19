package org.example.DTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String model;
  
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getFirstname() {
        return firstname;
    }
  
    public void setFirstname(String name) {
        this.firstname = name;
    }
  
 
    public String getModel() {
        return model;
    }
    
    @Override
    public String toString() {
   
    	return firstname+" "+lastname;
    }
}