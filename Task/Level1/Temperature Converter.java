package Internship;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Welcome to the the Temperature convertor\n" +
                "Enter\n" +
                "1. to convert Celsius to Fahrenheit\n" +
                "2. to convert Fahrenheit to Celsius\n" +
                "Enter the value :");
        int userValue = sc.nextInt();
        switch (userValue){
            case 1:
                float celsius = 0;
                System.out.print("Enter the value of Celsius : ");
                celsius = sc.nextFloat();
                float fahrenheit = (celsius * 9/5) + 32;
                System.out.println("The Fahrenheit is: "+fahrenheit+"°F");
                break;
            case 2:
                System.out.print("Enter the value of Fahrenheit : ");
                fahrenheit = sc.nextFloat();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("The Celsius is :"+celsius+"°C");
                break;
            default:
                sc.close();
                System.out.println("please enter the valid input");
        }
    }
}



