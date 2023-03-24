package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Prompt a use to input their number
        System.out.println("Guess the secret number");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        int Number = reader.nextInt();

//        if number is 5 , then correct
//        if number below 5 => too low
//        if number above 5 => too high

        if (Number == 5 ){
            System.out.println("You have guess the secret number ! Well Done!");
        } else if (Number < 5){
            System.out.println("Too low");
        } else{
            System.out.println("Too high");
        }
    }
}