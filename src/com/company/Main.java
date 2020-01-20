package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        }ss
        return inPutList;
    }

    private static void convertString(){
        String[] storedInput = userInput();
        System.out.println(Arrays.toString(storedInput));


    }
}
