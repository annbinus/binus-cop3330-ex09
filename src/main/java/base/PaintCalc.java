package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name

 * Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.


* Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

* Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

* Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.

 */

import java.util.Scanner;

public class PaintCalc {
    public static void main(String[] args) {

        int ConvFactor = 350;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length in feet? ");
        double length = scan.nextInt();

        System.out.print("What is the width in feet? ");
        double width = scan.nextInt();

        double area = length*width;
        int result = (int)Math.round((area/ConvFactor)*10)/10 ;

        if(result<area/ConvFactor){
            System.out.println("You will need to purchase " + (result+1) + " gallons of paint to cover " + area + " square feet.");
        }
        else{
            System.out.println("You will need to purchase " + (result) + " gallons of paint to cover " + area + " square feet.");
        }

    }
}
