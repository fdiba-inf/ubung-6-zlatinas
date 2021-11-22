package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        
        int reversedNumber = 0;
        int manipulatedNumber = num;
        while (manipulatedNumber > 0) {
          int nextDigit = manipulatedNumber % 10;
          reversedNumber = reversedNumber * 10 + nextDigit;
          manipulatedNumber = manipulatedNumber / 10;
        }
        boolean palindrome == num == reversedNumber;
        System.out.println("Palindrome: " + palindrome);

    }
}