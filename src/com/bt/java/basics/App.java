package com.bt.java.basics;

public class App {

    public static void main(String[] args) throws Exception {

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
