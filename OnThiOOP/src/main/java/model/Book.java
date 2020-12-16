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
public class Book implements Serializable{
    private static int currentId = 9999;
    private int id;
    private String  bookName, bookAuthor, bookMajor, bookYear;
    private int bookAmount;
    
    public Book(){
        
    }

    public Book( String bookName, String bookAuthor, String bookYear, String bookMajor, int bookAmount) {
        this.id = ++currentId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookMajor = bookMajor;
        this.bookAmount = bookAmount;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Book.currentId = currentId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public String getBookMajor() {
        return bookMajor;
    }

    public void setBookMajor(String bookMajor) {
        this.bookMajor = bookMajor;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }
    public Object[] toObjects(){
        return new Object[]{
            id, bookName, bookAuthor, bookMajor, bookYear, bookAmount
        };
    }
}
