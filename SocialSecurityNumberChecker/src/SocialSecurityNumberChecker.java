

/*****
* Name: Feras
* Description: This program is designed to check the proper Social Security
*   Number in the proper format without any input other than numbers in integers.
 */

//import
import java.util.Scanner;

public class SocialSecurityNumberChecker {
    public static void main(String[] args){ 
        //Create Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to get the SSN input
        System.out.println("Enter a Social Security Number in the "
                + "format 111-11-1111");
        
        //Declare a string that reads and hold the whole users input
        String socialN = input.nextLine();
        
        //Declare a character to hold the index of the user's input
        char indexOf0 = socialN.charAt(0);
        char indexOf1 = socialN.charAt(1);
        char indexOf2 = socialN.charAt(2);
        char indexOf4 = socialN.charAt(4);
        char indexOf5 = socialN.charAt(5);
        char indexOf7 = socialN.charAt(7);
        char indexOf8 = socialN.charAt(8);
        char indexOf9 = socialN.charAt(9);
        char indexOf10 = socialN.charAt(10);
        //Declare a character that holds the Hyphens characters
        char indexOfHyp3 = socialN.charAt(3);
        char indexOfHyp6 = socialN.charAt(6);
        //Use if statment to check the length of the input
       if(socialN.length() == 11){
           //use if statement to check if char is a digit or not
           if(Character.isDigit(indexOf1) && Character.isDigit(indexOf2) && 
                  Character.isDigit(indexOf4) && Character.isDigit(indexOf5) &&
                  Character.isDigit(indexOf7) && Character.isDigit(indexOf8) &&
                  Character.isDigit(indexOf9) && 
                  Character.isDigit(indexOf10) &&
                  Character.isDigit(indexOf0) && indexOfHyp3 == '-' && 
                  indexOfHyp6 == '-'){
               //Prompt the user with the valid SSN input
               System.out.println(socialN +
                  " is a valid Social Security Number");
            }//end nested if
            else{
               //Prompt the user with the invalid SSN input
          System.out.println(socialN+ " is an invalid Social Security Number");
            }//end else for nested if
        }//end First if statement
       else if (socialN.length()> 11 && socialN.length() <11){
           System.out.println(socialN +" is an invalid Social Security Number");
        }//end else if
       else {
           //Prompt the user with the invalid SSN input
           System.out.println(socialN+ " is an invalid Social Security Number");
        } // end else for First if statement
    }//end main
}//end class
