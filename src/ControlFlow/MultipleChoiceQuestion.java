package ControlFlow;

import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void  main(String[] args) {
        String question = "What is the name of FF7 protagonist?";
        String choiceOne = "Link";
        String choiceTwo = "Zelda";
        String choiceThree = "Cloud";

        String correct;
        correct = choiceThree;

        System.out.println(question);
        System.out.println("[] " + choiceOne);
        System.out.println("[] " + choiceTwo);
        System.out.println("[] " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.equals(correct) || answer.equals(correct.toLowerCase())) {
            System.out.println("You are true gamer!");
        } else {
            System.out.println("No, the correct answer is: " + choiceThree);
        }
    }
}
