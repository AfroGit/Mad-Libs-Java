/*
* # Author; Maurice Mutua
* # Goal; To learn the basics of using plus importing a    scanner,concatnation,common uses of operators andprimitive data types.
* # Test Automation University collabo
* # Date; 9/01/2023
*/

import java.util.Scanner;

public class MadLibs{

  public static void main(String args[]){

    //1. Get the season of the year.
    System.out.println("Enter favorite season of the year?");
    Scanner scanner = new Scanner(System.in);
    String season = scanner.next();

    //2. Get a descriptive adj from user.
    System.out.print("Describe your fav season!");
    scanner.next();
    String adject = scanner.next();

    //3. Get the number of cups consumed. 
         System.out.print("How much coffee makes it better?");
          scanner.nextInt();
           scanner.close();

    //4. Display results.

     System.out.print("This is my  " + season);
    
  }
  
}