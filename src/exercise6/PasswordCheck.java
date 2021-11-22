package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean passwordValid = false;
        do {
          
          System.out.println("Enter password: ");
          String pass = input.nextLine();

          if(pass.length() < 8) {
            continue;
          }
          boolean allLettersAndDigits = true;
          int digitCount = 0;
          for (int index = 0; index < pass.length(); index++) {
            char sym = pass.charAt(index);
            boolean letterOrDigit = Character.isLetterOrDigit(sym);
            if (!letterOrDigit) {
              allLettersAndDigits = false;
              break;
            }

            boolean digit = Character.isDigit(sym);
            if (digit) {
              digitCount++;
            }
          }
          
          if (allLettersAndDigits && digitCount >= 2) {
            passwordValid = true;
          }

        } while (!passwordValid);

        System.out.println("Password valid!");
    }
}