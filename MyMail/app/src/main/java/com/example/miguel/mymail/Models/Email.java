package com.example.miguel.mymail.Models;

import android.graphics.Color;

public class Email {

    private int iColor;
    private String sSender, sMsg, sSubject;

    private int[] arrColor = {Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE, Color.GRAY, Color.MAGENTA};

    public Email(){}

    public Email(String sSender, String sMsg, String sSubject) {
        this.sSender = sSender;
        this.sMsg = sMsg;
        this.sSubject = sSubject;
        this.iColor = this.arrColor[(int)Math.random()*6];
    }

    public int getiColor() {
        return iColor;
    }

    public void setiColor(int iColor) {
        this.iColor = iColor;
    }

    public String getsSender() {
        return sSender;
    }

    public void setsSender(String sSender) {
        this.sSender = sSender;
    }

    public String getsMsg() {
        return sMsg;
    }

    public void setsMsg(String sMsg) {
        this.sMsg = sMsg;
    }

    public String getsSubject() {
        return sSubject;
    }

    public void setsSubject(String sSubject) {
        this.sSubject = sSubject;
    }
}
