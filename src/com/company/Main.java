package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.print("Прогулка ");
        System.out.print(stroll(generateRandomAge(), -9));
        System.out.println(" " + generateRandomAge()+ "");
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
        Random random = new Random();
        return random.nextInt(100);
    }
}
