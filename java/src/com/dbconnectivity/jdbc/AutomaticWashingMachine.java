package com.dbconnectivity.jdbc;

public class AutomaticWashingMachine extends WashingMachine{
    public int timer=40;

    public AutomaticWashingMachine() {
        super();

    }

    public AutomaticWashingMachine(String loadingType, int timer) {
        super(loadingType);
        this.timer = timer;
    }

    public void displayLoadingTypeAndTimer(){
        System.out.println("displayLoadingTypeAndTimer() Loading type : " + loadingType);
        System.out.println("displayLoadingTypeAndTimer() Timer : " + timer);

        displayLoadingType();
    }

}
