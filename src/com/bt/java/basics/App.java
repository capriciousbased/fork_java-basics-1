package com.bt.java.basics;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());
        switch (input) {
            case 1:
                System.out.println("Black");
                break;
            case 2:
                System.out.println("White");
                break;
            case 3:
                System.out.println("Red");
                break;
            case 4:
                System.out.println("Green");
                break;
        }

    }

}
