//package com.ki;


import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int MyNumber = (int) (Math.random() * 100);
        int Usernumber = 0;

        do {
            System.out.println("Guese the number(1-100):");
            Usernumber = sc.nextInt();


            if (Usernumber == MyNumber) {
                System.out.println("WOOOH You guese the Right Numberrr");
                break;
            } else if (Usernumber > MyNumber) {
                System.out.println("Your Number is too large");
            } else {
                System.out.println("Your Number is too small");
            }
        }while (Usernumber>=0);
        System.out.print("My number was:");
        System.out.println(MyNumber);



    }
}
