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
public class MatHang implements Serializable{
    private static int currentId = 999;
    private int id;
    private String tenHang, nhomHang;
    private long giaBan;
   
    public MatHang() {
        
    }

    public MatHang(String tenHang, String nhomHang, long giaBan) {
        this.id = ++currentId;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaBan = giaBan;
        
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        MatHang.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

   

   public Object[] toObjects(){
       return new Object[]{
           id, tenHang, nhomHang, giaBan
       };
   }
 
    
}
