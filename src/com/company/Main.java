package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        // write your code here

        convertString();
    }

    private static String[] userInput() {
        Scanner myUserInput = new Scanner(System.in);
        //int  numberOfEntries = 0;
        //Boolean isValidInput = true;
        String[] inPutList = new String[3];

        for (int i = 0; i <= 2; i++) {
            System.out.println("Please enter a letter of the alphabet");
            inPutList[i] = myUserInput.nextLine();
            while (!inPutList[i].matches("[A-Za-z]+")) {
                System.out.println("Please enter a letter of the alphabet ony");
                inPutList[i] = myUserInput.nextLine();
            }
        }
        return inPutList;
    }

    private static void convertString(){
        String[] storedInput = userInput();
        System.out.println(Arrays.toString(storedInput));


    }
}
