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
public class NhanVien implements Serializable{
    private static int currentId = 999;
    private int id;
    private String hoTen, diaChi, soDt;
    private int bacLuong;

    public NhanVien() {
    }

    public NhanVien( String hoTen, String diaChi, String soDt, int bacLuong) {
        this.id = ++currentId;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDt = soDt;
        this.bacLuong = bacLuong;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        NhanVien.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public Object[] toObjects(){
        return new Object[]{
            id, hoTen, diaChi, soDt, bacLuong
        };
    }
    
    
    
}
