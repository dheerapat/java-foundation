package ControlFlow;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        System.out.println("Pick number 1 - 10");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();

        if (inputNum < 5) {
            System.out.println("Good luck");
        } else {
            System.out.println("Not so good");
        }
    }
}
