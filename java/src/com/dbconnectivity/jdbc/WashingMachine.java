package com.dbconnectivity.jdbc;

public class WashingMachine {

    public String loadingType = "front_loading";

    public WashingMachine(){
        System.out.println("default constructor");
    }

    public WashingMachine(String loadingType){
        this.loadingType = loadingType;
        System.out.println("loadingType constructor");
    }

    protected void displayLoadingType(){
        System.out.println("displayLoadingType() Loading type : " + loadingType);
    }
}
