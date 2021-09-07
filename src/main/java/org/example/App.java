package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declaration
        double conversionFactor = 0.09290304;

        System.out.println("\nWhat is the length of the room in feet? "); //output #1
        Scanner lengthInput = new Scanner(System.in); //scan for length of room in feet
        int length = lengthInput.nextInt();

        System.out.println("\nWhat is the width of the room in feet? "); //output #2
        Scanner widthInput = new Scanner(System.in); //scan for width of room in feet
        int width = widthInput.nextInt();

        System.out.println("\nYou entered dimensions of " + length + " feet by " + width + " feet."); //output #3

        int areaSquareFeet = length * width; //find the area in square feet
        double areaSquareMeters = areaSquareFeet * conversionFactor; //find the area in square meters

        System.out.println("The area is \n" + areaSquareFeet + " square feet \n" + String.format("%.3f", areaSquareMeters) + " square meters"); //output #4

    }
}