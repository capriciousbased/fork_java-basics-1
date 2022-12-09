package com.bt.java.basics;

public class App {

    public static void main(String[] args) throws Exception {

        char[] name = { 'A', 'w', ' ', 'A', 'C', 'a', 'd', 'c', 'm', 'y' };

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for (int i = name.length - 1; i >= 0; i--) {
            System.out.println(name[i]);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

}
