package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(cheekAgeAndTemperature(60, -5));
        System.out.println(cheekAgeAndTemperature(18, 23));
        System.out.println(cheekAgeAndTemperature(35, 10));
        System.out.println(cheekAgeAndTemperature(22, 23));
        System.out.println(cheekAgeAndTemperature(10, 15));
        System.out.println(  generateRandomAge()+ " "+  "Можно итти гулять");
    }

    public static String cheekAgeAndTemperature(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age > 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age < 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Остовайтесь дома";
        }


    }


    public static int generateRandomAge() {
        int min=20;
        int max=45;
        int diff=max-min;
        Random random = new Random();
        int randomIndex = random.nextInt(diff+1);
        return randomIndex;
    }
}






