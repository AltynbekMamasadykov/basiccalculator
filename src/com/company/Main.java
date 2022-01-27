package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*Необходимо написать простой консольный калькулятор на Java.

Метод int getInt() - должен считывать с консоли целое число и возвращать его
Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
арифметическую операцию, заданную operation.
Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(),
передать все методу calc() и вывести на экран результат. */

    readMe();
    int num1 = getInt();
    int num2 = getInt();
    char operation = getOperation();
    System.out.println(calc(num1,num2,operation));


    }

    static void  readMe(){
        System.out.println();
        System.out.println("This calculator is ONLY positive integer calculator. Hope some day will do it better");
    }

    static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
            int number = scanner.nextInt();
            return number;
        }

    static char getOperation(){
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter operator");
        operator = scanner.next().charAt(0);
        return operator;
    }

    static int calc(int num1,int num2,char operation){
        int result =0;
        switch (operation){
            case '*':
                result = num1*num2;
                break;
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }return result;
    }
}
