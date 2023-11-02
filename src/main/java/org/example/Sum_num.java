package org.example;

import java.util.Scanner;

//С клавиатуры вводится число, нужно
// посчитать сумму цифр введенных  чисел и вывести на печать
public class Sum_num {
    public static void main(String[] args) {
        int a[] = {};
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
            while (array[i] != 0) {
                b = b + array[i] % 10;
                array[i] = array[i] / 10;
            }
            System.out.println("Сумма цифр введенных чисел = "+b);
        }

    }
}
