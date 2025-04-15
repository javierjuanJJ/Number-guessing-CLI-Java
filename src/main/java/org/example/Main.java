package org.example;

public class Main {
    // Constantes definidas según requerimientos
    private static final int CHANCES_LIMIT = 7;
    private static final int RANDOM_LIMIT_HIGH = 100;
    private static final int RANDOM_LIMIT_LOW = 1;

    public static void main(String[] args) {
        // Inicializar variables
        int counter = 0;
        boolean hasGuessedCorrectly = false;

        // Generar número aleatorio
        int secretNumber = UtilMethods.generateRandomNumber(RANDOM_LIMIT_LOW, RANDOM_LIMIT_HIGH);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre " + RANDOM_LIMIT_LOW + " y " + RANDOM_LIMIT_HIGH);
        System.out.println("Tienes " + CHANCES_LIMIT + " oportunidades para adivinarlo.");

        // Bucle principal del juego
        while (counter < CHANCES_LIMIT && !hasGuessedCorrectly) {
            counter++;
            System.out.print("Intento #" + counter + ": Introduce tu número: ");

            int userGuess;
            userGuess = UtilMethods.readIntKeyboard();

            // Comprobar la respuesta
            if (userGuess > secretNumber) {
                System.out.println("Demasiado alto. Intenta con un número menor.");
            } else if (userGuess < secretNumber) {
                System.out.println("Demasiado bajo. Intenta con un número mayor.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + counter + " intentos!");
            }

            // Mostrar intentos restantes
            if (!hasGuessedCorrectly && counter < CHANCES_LIMIT) {
                System.out.println("Te quedan " + (CHANCES_LIMIT - counter) + " intentos.");
            }
        }

        // Mensaje final si se acaban los intentos
        if (!hasGuessedCorrectly) {
            System.out.println("¡Se acabaron los intentos! El número era: " + secretNumber);
        }
    }

}