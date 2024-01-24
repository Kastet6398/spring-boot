package com.example.springboot.controllers;

public class DataModel {
    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    private int anInt;
    private String aString;
    private boolean aBoolean;
    public DataModel(int anInt, String aString, boolean aBoolean) {
        this.anInt = anInt;
        this.aString = aString;
        this.aBoolean = aBoolean;
    }
}
