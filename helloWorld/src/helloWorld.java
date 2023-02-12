// Alexander Andrade Beltran
// helloWorld
// 1/29/2023

import java.util.Scanner;
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner userName = new Scanner(System.in);
        System.out.println("Nice to meet you " + userName.nextLine() + "! I hope you have an amazing day!");
    }
}