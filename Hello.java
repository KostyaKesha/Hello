package test;

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Input name and press Enter");
        String name=sc.nextLine();
        System.out.println ("Hello dear," + " " + name+"!");
        System.out.println ("Have a nice day!");
        sc.close();

    }
}

