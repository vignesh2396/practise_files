package com.dbconnectivity.jdbc;

public class AccessModifiers {
    public static void main(String[] args) {
        AutomaticWashingMachine automaticWashingMachine = new AutomaticWashingMachine();
        System.out.println("Automatic - LoadingType : " +automaticWashingMachine.loadingType);
        automaticWashingMachine.displayLoadingType();

        System.out.println("Automatic - Timer : " +automaticWashingMachine.timer);
        automaticWashingMachine.displayLoadingTypeAndTimer();
    }
}
