package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        // write your code here

        convertNumber();
    }



    private static String[] userInput() {
        Scanner myUserInput = new Scanner(System.in);
        //int  numberOfEntries = 0;
        //Boolean isValidInput = true;
        String[] inPutList = new String[3];

        for (int i = 0; i <= 2; i++) {
            System.out.println("Please enter a letter of the alphabet");
            inPutList[i] = myUserInput.nextLine();
            while (!inPutList[i].matches("[A-Za-z]+")|| inPutList[i].length()!=1) {
                System.out.println("Please enter a letter of the alphabet ony");
                inPutList[i] = myUserInput.nextLine();
            }
        }
        return inPutList;
    }

    private static char[] convertString(){
        String[] storedInput = userInput();
        System.out.println(Arrays.toString(storedInput));

        StringBuffer sb = new StringBuffer(); // convert the string array into a single string
        for(int i = 0; i <storedInput.length;i++){
            sb.append(storedInput[i]);
        }
        String oneString = sb.toString();
        System.out.println(oneString);

        char[] charArray = new char[oneString.length()];// now convert the string to a char array
        for(int i = 0;i <oneString.length();i++){
            charArray[i] = oneString.charAt(i);
        }
    return charArray;
    }

    private static void convertNumber() {
        char[] convertToNumber = convertString();
        for (char c : convertToNumber){
            System.out.println(c);
        }
        int sumOfChar = 0;
        for(int i = 0;i< convertToNumber.length;i++){
            if(convertToNumber[i] >= 'a' && convertToNumber[i] <= 'z'){
                sumOfChar = sumOfChar + convertToNumber[i] - 'a' +1;
            }else if(convertToNumber[i]>= 'A' && convertToNumber[i] <= 'Z'){
                sumOfChar = sumOfChar + convertToNumber[i] - 'A' +100;
            }
        }
        System.out.println(sumOfChar);
    }
}
