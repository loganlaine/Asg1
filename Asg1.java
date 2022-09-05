/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 15AUG2022	Instructor - Professor Rowson
* Program created to calculate product price before and after desired discount. 
*/

import java.util.Scanner; //Scanner imported to use scanner function.

public class Asg1 { //Class.

    public static void main(String[] args) { //Main.
    	
        Scanner scan = new Scanner(System.in); //scanner used to input data.
        Scanner string = new Scanner(System.in);

        System.out.println("Enter your Customer ID (0 - 999999): "); //Data input by user.
        int customerID = scan.nextInt(); //Collects data.
        
        System.out.println("Enter product discription: ");
        String discription = string.nextLine(); 

        System.out.println("Enter unit price (ex: 3.75): ");
        double unitPrice = scan.nextDouble(); 
        
        System.out.println("Enter quantity (as whole number): ");
        int qty = scan.nextInt(); 

        System.out.println("Enter discount (ex: .10): ");
        double discount = scan.nextDouble(); 
        
        //Values
        double beforeDiscount = (unitPrice * qty);
        double afterDiscount = (beforeDiscount * 1) - (beforeDiscount*discount);
        
        //Output to console
        System.out.println(); //used to separate data. 
        System.out.println("Logan, Laine	CMIS 141/6382	Date (08/15/2022)"); //Class info display.
        System.out.println(); //used to separate data. 
        System.out.println("ORDER DATA:");
        System.out.println("Customer ID: " + customerID); //Displays data.
        System.out.println("Product Discription: " + discription); 
        System.out.println("Unit Price: $" + unitPrice); 
        System.out.println("Quantity: " + qty); 
        System.out.println("Discount: " + discount*100 + "%"); 
        
        System.out.println(); //used to separate data. 
        System.out.println("Total before discount: $" + beforeDiscount); 
        System.out.println("Total after discount: $" + afterDiscount);
        
        //Closes out scanners.
        scan.close();
        string.close();


     }

}