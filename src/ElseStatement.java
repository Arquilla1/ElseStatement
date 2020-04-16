//Pseudocode
//Prompt user to enter a number
//check user input
//begin if else loop
//if user input is equal to or greater than 10 print number is greater than 10
//if user input is equal to or less than 10 print number is less than 10
//End loop


import java.util.Scanner;
public class ElseStatement {
    public static void main(String[] args) {

        int number = 0;

                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number:");
        number = scanner.nextInt();
        scanner.close();

        if (number >= 10) {
            System.out.println("Number is greater than 10.");
        }
        else if(number <= 10)
            System.out.println("Number is less than 10.");
        {


        System.out.println("Application finished.");
    }

}}
