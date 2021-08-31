package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Прогулка ");
        System.out.print(stroll(51, -9));
    }

    public static String stroll(int ageOfPerson, int temperature) {
        if ((ageOfPerson >= 20 && ageOfPerson < 45) && (temperature >= -20 && temperature < 30)) {
            return "Можно идти гулять";
        } else if ((ageOfPerson < 20) && (temperature >= 0 && temperature < 28)) {
            return "Можно идти гулять";
        } else if ((ageOfPerson > 45) && (temperature >= -10 && temperature < 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return 20;
    }
}
