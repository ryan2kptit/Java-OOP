/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author dong
 */
public class PhongBan implements Serializable{
    private static  int currentId = 99;
    private int id;
    private String tenPhong, moTa;
    private int heSoCongViec;
    
    public PhongBan(){
        
    }

    public PhongBan( String tenPhong, String moTa, int heSoCongViec) {
        this.id = ++currentId;
        this.tenPhong = tenPhong;
        this.moTa = moTa;
        this.heSoCongViec = heSoCongViec;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PhongBan.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHeSoCongViec() {
        return heSoCongViec;
    }

    public void setHeSoCongViec(int heSoCongViec) {
        this.heSoCongViec = heSoCongViec;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            id, tenPhong, moTa, heSoCongViec
        };
    }
}
