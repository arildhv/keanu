package com.arildhv;

public class main {
    public static void main(String[] args) {
        String key = "b8663d389735608463f9334969f3f89d";
        String keanuId = "6384";

        apicaller caller = new apicaller(key, keanuId);

        String birthDate = caller.getBirthdate();
        datechecker checker = new datechecker();

        if(birthDate.equals("")) {
            System.out.println("An error occured.");
        }
        else if (checker.checkBirthday(birthDate)) {
            System.out.println("It is Keanus birthday!");
        }
        else {
            System.out.println("It is not Keanus birthday.");
        }
    }
}