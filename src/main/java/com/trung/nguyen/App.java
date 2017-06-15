package com.trung.nguyen;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int number = 1;

        while (number > 0) {
            System.out.println();
            System.out.print("Enter a positive number: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            terms(number);
        }
    }

    private static void terms(int number) {
        int revNum = 0;
        System.out.print("Sequence:");
        int i = 0;
        while(i < 10) {
            if (number == revNum) break;
            number += revNum;
            System.out.print(" ");
            System.out.print(number);
            revNum = rev(number);
            i++;
        }
    }

    private static int rev(int number) {
        int num = number;
        int revNum = 0;
        while (num > 0){
            revNum = revNum * 10;
            revNum += num % 10;
            num = num / 10;
        }
        return revNum;
    }
}
