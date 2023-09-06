/*
* # Author; Maurice Mutua
* # Goal; To learn the basics of using plus importing a    scanner,concatnation,common uses of operators andprimitive data types.
* # Test Automation University collabo
* # Date: 9/01/2023.
* # Debugged Date: 9/6/2023
*/

import java.util.Scanner;

public class MadLibs{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);

    //1. Get the season of the year.
    System.out.println("Enter favorite season of the year? ");
    String season = scanner.nextLine();

    //2. Get the number of cups consumed. 
         System.out.print("How much coffee makes it better? \n");
         int coffee = scanner.nextInt();
          scanner.nextLine();
           //scanner.close(); dont uncomment

    //3. Get a descriptive adj from user.
    System.out.println("Describe your fave season! \n ");
    String adject = scanner.nextLine();
    

    //4. Display results.

System.out.println("Fave season is: " + season + " its sooo " + adject + " only " +coffee+ " cups of coffee make it better");
    
  }
  
}