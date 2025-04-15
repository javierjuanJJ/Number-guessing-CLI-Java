package org.example;

import java.util.Scanner;

public class UtilMethods {
    /**
     * Genera un número aleatorio entre los límites especificados
     * @param min El límite inferior
     * @param max El límite superior
     * @return Un número aleatorio entre min y max (inclusive)
     */
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    static int readIntKeyboard() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            System.err.println("Error: Debe introducir un número entero.");
        }
        return scanner.nextInt();

    }
}
