package org.example;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("Начало игры: ");

        String notUsed = "abcdefghijklmnopqrstuvwxyz";

        String[] words = new String[] { "computer", "mouse", "screen", "display", "language" };

        String randomWord = words[(int) (Math.random() * words.length)];

        System.out.println("Слово имеет " + randomWord.length() + " букв");

        char[] letters = new char[randomWord.length()];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '.';
        }

        int lives = 3;

        Scanner scanner = new Scanner(System.in);

        while (lives > 0) {
            System.out.print("Количество жизней: ");

            for (int i = 0; i < lives; i++) {
                System.out.print("O");
            }

            System.out.println();

            System.out.println("Ввод: ");

            String input = scanner.nextLine();

            char letter = input.charAt(0);

            boolean isGuessCorrect = false;

            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);

                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }

            if (!isGuessCorrect) {
                lives = lives - 1;
            }

            boolean isGameFinished = true;

            System.out.print("Слово: ");

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == '.') {
                    isGameFinished = false;
                }

                System.out.print(letters[i]);
            }

            System.out.println();

            notUsed = notUsed.replace(letter, '.');

            System.out.println("Неиспользованные буквы: " + notUsed);

            System.out.println("--------------------------");

            if (isGameFinished) {
                System.out.println("Ты выиграл!");
                break;
            }
        }

        if (lives == 0) {
            System.out.println("Ты проиграл! Загаданное слово: " + randomWord);
        }

        System.out.println("Окончание игры");
    }
}
