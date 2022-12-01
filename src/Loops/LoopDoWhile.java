package Loops;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        int i = 0;
        int count = 3;
        do {
            System.out.print("Enter Password:");
            password = scan.next();
            i++;
            count--;
            if (!password.equals("shark50")){
                System.out.println("you have [" + count + "] attempts left");
            }
        }
        while (!password.equals("shark50") & i < 3);

        if (password.equals("shark50")) {
            System.out.println("ACCESS APPROVED");
        }

    }
}





