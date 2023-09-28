package ControlFlow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Do you want to play next song?");
            String input = scanner.next();

            if ("yes".equals(input)) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
