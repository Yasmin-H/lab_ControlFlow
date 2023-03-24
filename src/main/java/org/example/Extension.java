package org.example;

import java.util.Scanner;

public class Extension {
    public static void main(String[] args) {
//        Prompt a use to input the weather and the average temp for the day
        System.out.println("What is the weather today?");

        System.out.println("What is the temperature today?");


//        Collect user input
        Scanner reader= new Scanner(System.in);
        String weather = reader.nextLine();
        int temp = reader.nextInt();

//        if it is both rainy and less than 12 deg -> wear a waterproof winter coat
//        if it sunny and above 18 degrees -> wear something light
//        if it snow and less than 0 degrees -> wear a thick winter coat , scarf and some gloves
//        if it cloudy and more than 10 degrees -> a coat will do

        if( weather.equals("rainy") && temp > 12){
            System.out.println("wear a waterproof winter coat");
        } else if (weather.equals("sunny") && temp > 18){
            System.out.println("wear something light as it will be quite warm today");
        } else if (weather.equals("snow") && temp < 0){
            System.out.println("wear a thick winter coat , scarf and some gloves");
        } else if(weather.equals("cloudy") && temp > 10){
            System.out.println("a coat will do");
        }
//

    }
}


