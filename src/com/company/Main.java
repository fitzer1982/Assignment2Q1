package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        isItFive(); // this is the method that starts the chain
    }

    private static String[] userInput() {
        Scanner myUserInput = new Scanner(System.in); // new scanner to take user input
        String[] inPutList = new String[3]; //create an array for storing user input

        for (int i = 0; i <= 2; i++) {
            System.out.println("Please enter a letter of the alphabet"); //ask for input
            inPutList[i] = myUserInput.nextLine();// for loop that looks for the user input 3 times
            while (!inPutList[i].matches("[A-Za-z]+")|| inPutList[i].length()!=1) { // validation that stops user from proceeding
                System.out.println("invalid, Please enter a single letter of the alphabet only");
                inPutList[i] = myUserInput.nextLine(); // stores the input if the user enters correctly
            }
        }
        return inPutList; //returns what the user has enter
    }

    private static char[] convertString(){
        String[] storedInput = userInput(); // start the method for userInput
        System.out.println("You have entered: " + Arrays.toString(storedInput));

        StringBuffer sb = new StringBuffer(); // convert the string array into a single string
        for(int i = 0; i <storedInput.length;i++){ //go through each place in the array
            sb.append(storedInput[i]);
        }
        String oneString = sb.toString(); //new string that contains the old array as one string
        char[] charArray = new char[oneString.length()];// now convert the string to a char array
        for(int i = 0;i <oneString.length();i++){
            charArray[i] = oneString.charAt(i);// take eash place in the string and move it into the char array
        }
    return charArray;
    }

    private static int convertNumber() {
        char[] convertToNumber = convertString(); //start the convertString method and put get the char array
        int sumOfChar = 0;
        for(int i = 0;i< convertToNumber.length;i++){ //go through each char
            if(convertToNumber[i] >= 'a' && convertToNumber[i] <= 'z'){ //use the ascii tables to assign values
                sumOfChar = sumOfChar + convertToNumber[i] - 'a' +1;
            }else if(convertToNumber[i]>= 'A' && convertToNumber[i] <= 'Z'){//use the ascii tables to assign values
                sumOfChar = sumOfChar + convertToNumber[i] - 'A' +100;
            }
        }
        return sumOfChar;
    }

    private static void isItFive(){
        int divideByFive = convertNumber(); //start the convert number method and assign it a new variable
        System.out.println("The Sum of the value is "+ divideByFive);
        if(divideByFive % 5 == 0){ //check if its divisble by 5
            System.out.println("Congratulations you have cracked the code");
        }else{
            System.out.println("Incorrect password, please try again");
            isItFive();
        }


    }
}
