package chapter4;

import java.util.Scanner;

public class Lettersearch {
 public static void main(String[] args) {
    System.out.println("Enter Some text");
    Scanner scanner = new Scanner(System.in);

    String inputText = scanner.next();

    String IdentifyChar;
    boolean letterFound = false; 
    do {
        System.out.println("What letter would you like to identify the count of? Max 1 character is allowed");
        IdentifyChar = scanner.next(); 
    } while (IdentifyChar.length() > 1 || IdentifyChar.length() == 0);
   

    for(int i=0; i<inputText.length(); i++){
        char currentLetter = inputText.charAt(i);
        letterFound = false; 
        
        if (currentLetter == IdentifyChar.toLowerCase().charAt(0) || currentLetter == IdentifyChar.toUpperCase().charAt(0)) {
          letterFound = true;
          break; 
        }
    }

    if (letterFound) {
        System.out.println("The letter " + IdentifyChar + " has been found");
    } else{
        System.out.println("Your letter " + IdentifyChar + " has not been found in the word: " + inputText);
    }
    scanner.close();  
 }
}

