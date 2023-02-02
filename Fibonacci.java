package Donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonacci serinizin kaç elemanlı olacağını giriniz : ");
        int n = inp.nextInt();
        int oldValue = 0;
        int newValue;
        int currentValue = 1;

        if (n == 1) {
            System.out.print("0");
        }
        if (n == 2) {
            System.out.print("0 1 ");
        }
        if (n > 2) {
            System.out.print("0 1 ");

            for (int i = 1; i <= (n - 1); i++) {
                newValue = currentValue + oldValue;
                System.out.print(newValue + " ");
                oldValue = currentValue;
                currentValue = newValue;

            }
        }
    }
}
