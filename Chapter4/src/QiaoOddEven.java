// Name: Antonio Qiao
// Date: 2019.10.28
// Assignment Name: Odd or Even
//Description: This program tell when the input integer is odd or even.

import java.util.Scanner;

public class QiaoOddEven {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = console.nextLine();
        boolean stop = true;

        while (stop == true) {
            System.out.println("");
            System.out.println("Would you like to input a number (Y/N)?");
            String answer = console.nextLine();

            if (answer.equals("Y")) {
                System.out.print("Enter an integer: ");
                int number = console.nextInt();
                console.nextLine();
                if (number % 2 == 0) {
                    System.out.println("The integer " + number + " is even.");
                } else
                    System.out.println("The integer " + number + " is odd. ");
            } else if (answer.equals("N")) {
                stop = false;

                System.out.println(name + ", the program is over. Have a nice day!");

            }

        }
    }
}
