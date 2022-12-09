package com.bt.java.basics;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner Obj = new Scanner(System.in);
        String Name;

        // Enter username and press Enter
        System.out.println("Enter Name");
        Name = Obj.nextLine();
        System.out.println("Hello " + Name + ", welcome to AW Academy. ");

    }

}
