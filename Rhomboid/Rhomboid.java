package Rhomboid;

import java.util.Scanner;
class Rhomboid {
    public static void printNChar (int number, char character) {
        for (int counter = number; counter > 0; counter--){
            System.out.print (character);
        }
    }
    public static int ABS (int number) {
        if (number < 0) {
            number = number * -1;
        }
        return number;
    }
    public static int calculator (int number, int num2) {
        num2 = num2 - number;
        num2 = ABS (num2);
        num2 = (num2 * 2) - 1;
        return num2;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt ();
        int num1, num2;
        number = ABS (number);
        num1 = number - 1;
        for (int counter = (number * 2) - 1; counter > 0; counter = counter - 1) {
            num2 = ABS (num1);
            printNChar (num2, ' ');
            num2 = calculator(number, num2);
            printNChar(num2, '*');
            System.out.println ();
            num1 = num1 - 1;
        }
        sc.close ();
    }
}