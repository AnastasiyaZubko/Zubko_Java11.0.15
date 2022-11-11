package Zubko;

import java.util.Scanner;

public class Number {
    public void enterNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввдедите число:\n");
        while (!sc.hasNextInt()) {
            System.out.println("Необходимо ввести число");
            sc.next();
        }
        int a = sc.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
        //else {
        //System.out.println("Попробуй снова");
        //enterNumber();
        //}


    }
}


