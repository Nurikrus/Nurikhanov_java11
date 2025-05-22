package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String helpText = "Введите команду:\n" +
            "1 - для запуска сравнения чисел и вычисления их сложения, вычитания, деления и умножения;\n" +
            "2 - для запуска сравнения строк;\n" +
            "3 - для вывода чётных чисел из массива чисел;\n" +
            "0 - для выхода из программы;\n" +
            "help - для вызова справки";

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу!");
        System.out.println(helpText);

        Scanner scanner = new Scanner(System.in);
        boolean log = true;

        while (log) {
        String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("Сравнение двух чисел и совершение математических операций");
                    numbers();
                    System.out.println("Вы вышли из программы, введите команду:");
                    break;
                case "2":
                    System.out.println("Сравнение двух строк");
                    strings();
                    System.out.println("Вы вышли из программы, введите команду:");
                    break;
                case "3":
                    System.out.println("Вывод четных чисел из массива");
                    array();
                    System.out.println("Вы вышли из программы, введите команду:");
                    break;
                case "0":
                    log = false;
                    break;
                case "help":
                    System.out.println(helpText);
                    break;
                default:
                    System.out.println("Не правильно введена команда, введите команду или help для справки:");
                    break;
            }
        }
    }

    private static void numbers() {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а: ");
        String a = scanner.nextLine();
        while (a.matches("\\D")||a.isEmpty()){
            System.out.println("Вы ввели не число, введите число a:");
            a = scanner.nextLine();
        }
        double a1 = Integer.parseInt(a);
        System.out.println("Введите число b: ");
        String b = scanner.nextLine();
        while (b.matches("\\D")||b.isEmpty()){
            System.out.println("Вы ввели не число, введите число b:");
            b = scanner.nextLine();
        }
        double b1 = Integer.parseInt(b);
        if (b1==0){
            if (a1<b1) {
                result.append("a<b\n").append("сумма чисел равна ").append(a1).
                        append("\nразность чисел равна ").append(a1).
                        append("\nнельзя разделить на 0\nпроизведение равно 0");
            } else if (a1>b1) {
                result.append("a>b\n").append("сумма чисел равна ").append(a1).
                        append("\nразность чисел равна ").append(a1).
                        append("\nнельзя разделить на 0\nпроизведение равно 0");
            } else {
                result.append("a=b\nсумма чисел равна 0\nразность чисел равна 0\nнельзя разделить на 0\nпроизведение равно 0");
            }
        } else {
            if (a1<b1) {
                result.append("a<b\n").append("сумма чисел равна ").append(a1 + b1).
                        append("\nразность чисел равна ").append(a1 - b1).
                        append("\nделение чисел равно ").append(a1/b1).
                        append("\nпроизведение чисел равно ").append(a1*b1);
            } else if (a1>b1) {
                result.append("a>b\n").append("сумма чисел равна ").append(a1 + b1).
                        append("\nразность чисел равна ").append(a1 - b1).
                        append("\nделение чисел равно ").append(a1/b1).
                        append("\nпроизведение чисел равно ").append(a1*b1);
            } else {
                result.append("a=b\nсумма чисел равна ").append(a1 + b1).
                        append("\nразность чисел равна 0").
                        append("\nделение чисел равно 1").
                        append("\nпроизведение равно ").append(a1*b1);
            }
        }
        System.out.println(result);
    }

    private static void strings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    private static void array(){
        List<Integer> array = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> arrayOut = new ArrayList<>();
        System.out.println(array);
        for (int a: array){
            if (a%2==0){
                arrayOut.add(a);
            }
        }
        System.out.println("Четные числа в массиве");
        System.out.println(arrayOut);
    }
}