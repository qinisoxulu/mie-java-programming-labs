package za.co.mie.lab_6;

import za.co.mie.lab_4.BankAccount;

public class Debugging {

    static String classify(int mark){
        if (mark >= 80){
            return "Distinction";
        } else if (mark >= 50){
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args){
        // Exercise 6.1
        // The == operator checks if two variables point to the same object, and new String creates two different objects with the same text, so equals must be used to compare the text.
        String first = new String("Java");
        String second = new String("Java");
        System.out.println("6.1 first == second: " + (first == second));
        if (first.equals(second)) {
            System.out.println("Same text");
        } else {
            System.out.println("Different text");
        }

        // Exercise 6.2
        // The loop uses <= so i becomes 3, but the last valid index of an array with 3 items is 2, so the condition must be i < numbers.length.
        int[] numbers = {10, 20, 30};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Exercise 6.3
        // Because 85 is already greater than 50, the first condition catches it and the Distinction condition is never reached, so the highest mark must be checked first.
        int mark = 85;
        System.out.println("6.3 " + mark + ": " + classify(mark));
        System.out.println("6.3 " + 50 + ": " + classify(50));
        System.out.println("6.3 " + 49 + ": " + classify(49));

        // Exercise 6.4
        BankAccount account = new BankAccount("Qiniso Xulu", 1234, 500);
        account.withdraw(100);
        System.out.println("6.4 valid: " + account.getBalance());
        account.withdraw(0);
        System.out.println("6.4 zero: " + account.getBalance());
        account.withdraw(-50);
        System.out.println("6.4 negative: " + account.getBalance());
        account.withdraw(1000);
        System.out.println("6.4 more than balance: " + account.getBalance());
        account.withdraw(400);
        System.out.println("6.4 full balance: " + account.getBalance());
    }
}
