package org.example;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Press 0 for String Reverse");
        System.out.println("Press 1 for Int Reverse");
        System.out.print("Your choice: ");
        Scanner ch = new Scanner(System.in);
        int choice = ch.nextInt();
        if (choice == 0){
            System.out.print("Input Yor String: ");
            Scanner str = new Scanner(System.in);
            String string = str.nextLine();
            String reverse = "";
            int length = string.length();
            for(int i=0; i<length; i++){
                reverse = string.charAt(i) + reverse;
            }
            System.out.println(reverse);
        }
        else if (choice == 1) {
            Integer numberInt;
            System.out.print("Input Yor Numbers: ");
            Scanner inte = new Scanner(System.in);
            int integer = inte.nextInt();
            String numbers = String.valueOf(integer);
            String reverse = "";
            int length = numbers.length();
            for(int i=0; i<length; i++){
                reverse = numbers.charAt(i) + reverse;
            }
            numberInt = Integer.valueOf(reverse);
            System.out.println(numberInt);
        }
        else{
            System.out.println("Wrong Choice!");
        }
    }
}

