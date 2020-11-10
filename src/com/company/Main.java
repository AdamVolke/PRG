package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej větu:");
        String input = sc.nextLine();
        int lenght = input.length();
        for (int i = 0; i != input.length(); i++) {
            char character = input.charAt(i);
            int code = (int)character ;
            System.out.println(code);

        }
    }
}
