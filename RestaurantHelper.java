/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Kinjal Class: ICS3U
 *
 * Program: Restaurant Helper 
 * Input (A template for the server at a restaurant)
 * Processing: (information on the server, and restaurant)
 * Output: (restaurant server template)
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;
import java.awt.Color;
import java.text.*;

/**
 *
 * @author Kinjal
 */
public class RestaurantHelper {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console();
        //asks for bill total and tip 
        c.println ("Enter the Bill Total"); 
        double billTotal;
        double tip; 
        billTotal = c.readDouble(); 
        c.println ("Enter the Tip you would like to give the amazing server"); 
        tip = c.readDouble (); 
        //clear screen and prints restaruant details 
        c.clear();
        c.setTextColor (Color.red);
        c.println("*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*");
        c.setTextColor (Color.magenta);
        c.println("Better Burger"); 
        c.println("~Have Good Health, Enjoy Your Wealth~"); 
        c.setTextColor (Color.red);
        c.println("*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*");
        c.setTextColor (Color.black);
        //fills out server details, time, and date
        c.print("Name of Server: "); 
        c.println("Kinjal Padhiar");
        c.print("Served on: ");
        c.printDate( );
        c.print (" ");
        c.printTime( ); 
        c.println("");
        //calculates bill total with taxes (federal or HST)
        c.println("Subtotal: $" + billTotal);
        double tax = 0;
        //calculates total if bill is more than 4
        if (billTotal>4) {
            tax = billTotal*0.13;
            DecimalFormat taxf = new DecimalFormat ("#.##");
            c.println ("Tax: $" + taxf.format (tax));
            billTotal = billTotal + tax;
        }
        //if it is less then 4 it only puts 5% tax on it 
        else {
            tax = billTotal*0.05;
            DecimalFormat taxf = new DecimalFormat ("#.##");
            c.println ("Tax: $" + taxf.format (tax));
            billTotal = billTotal + tax;
        }
        c.println ("Tip: $"+ tip);
        //sums bill total and tip (outputs rounded answer) 
        double totalAmount = billTotal + tip; 
        DecimalFormat totalAmountf = new DecimalFormat ("#.##");
        c.println("Total: $" + totalAmountf.format (totalAmount));
        c.setTextColor (Color.red);
        c.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        c.setTextColor (Color.black);
        //user enters amount paid
        c.println ("Enter the amount paid: ");
        double amountPaid = c.readDouble ();
        c.println ("Amount Paid: " + amountPaid);
        //calculates change and outputs rounded answer 
        double change = 0;
        if (amountPaid>totalAmount) {
            change = amountPaid - totalAmount;
            DecimalFormat changef = new DecimalFormat ("#.##");
            c.println ("Change Owed: " + changef.format (change)); 
        }
        //accounts for if not enough money is given 
        else if (amountPaid<totalAmount) {
            c.println ("Sorry the amount paid isn't enough");
        }
        //re-writes restaraunt information 
        c.setTextColor (Color.red);
        c.println("*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*");
        c.setTextColor (Color.magenta);
        c.println("Better Burger"); 
        c.println("~Have Good Health, Enjoy Your Wealth~"); 
        c.setTextColor (Color.red);
        c.println("*-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_*");
                    
    }
}
