package com.atitomirov;

public class Main {
    public static void main(String[] args) {

        int a = 74, b = 17, c = 22;
        double d = 0.99;

        // арифметические операторы

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // логические операторы

        System.out.println(a > (b +7));
        System.out.println(a > (b * 3));
        System.out.println(a >= (b +17));
        System.out.println(a >= (b + 22));
        System.out.println(a < (b + 8));
        System.out.println(a < (b + 17));
        System.out.println(a <= (b + 3));
        System.out.println(a <= (b + 19));

        // комбинирование типов данных на примере int и double

        System.out.println(c + d);

        // переполнение на примере int (-2147483648...2147483647)

        int firstInt = 2147483647;
        int secondInt = 1000;
        int resultInt = firstInt + secondInt;
        System.out.println(resultInt);

        // переполнение на примере byte (-128...127)

        byte firstByte = -128;
        byte secondByte = 127;
        byte resultByte = (byte) (firstByte - secondByte);
        System.out.println(resultByte);

    }
}