/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author dong
 */
public class Reader implements Serializable {
    
    private static int currentId = 9999;
    private int id;
    private String name, address, phoneNum;

    public Reader() {
    }

    public Reader(int id, String name, String address, String phoneNum) {
        this.id = ++currentId;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Reader.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            id, name, address, phoneNum
        };
    }
}
