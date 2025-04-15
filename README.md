Here is an example of a `README.md` file with instructions for running the program and examples of its usage:

```markdown
# Number Guessing Game (CLI)

This is a simple command-line game where the user has to guess a randomly generated number within a limited number of attempts.

## Requirements

- Java 17 or higher
- Maven

## How to Run the Program

1. **Clone the Repository**  
   Clone the project to your local machine:
   ```bash
   git clone <repository-url>
   cd Number_guessing_CLI_Java
   ```

2. **Build the Project**  
   Use Maven to compile the project:
   ```bash
   mvn clean compile
   ```

3. **Run the Program**  
   Execute the program using the following command:
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

## How to Play

1. When the program starts, it will generate a random number between 1 and 100 (inclusive).
2. You will have 7 attempts to guess the number.
3. After each guess, the program will provide feedback:
    - If your guess is too high, it will prompt you to try a smaller number.
    - If your guess is too low, it will prompt you to try a larger number.
4. If you guess the number correctly, the program will congratulate you and display the number of attempts it took.
5. If you fail to guess the number within 7 attempts, the program will reveal the correct number.

## Example Usage

### Example 1: Successful Guess
```
¡Bienvenido al juego de adivinar el número!
Estoy pensando en un número entre 1 y 100
Tienes 7 oportunidades para adivinarlo.
Intento #1: Introduce tu número: 50
Demasiado bajo. Intenta con un número mayor.
Te quedan 6 intentos.
Intento #2: Introduce tu número: 75
Demasiado alto. Intenta con un número menor.
Te quedan 5 intentos.
Intento #3: Introduce tu número: 63
¡Felicidades! ¡Has adivinado el número en 3 intentos!
```

### Example 2: Failed to Guess
```
¡Bienvenido al juego de adivinar el número!
Estoy pensando en un número entre 1 y 100
Tienes 7 oportunidades para adivinarlo.
Intento #1: Introduce tu número: 50
Demasiado bajo. Intenta con un número mayor.
Te quedan 6 intentos.
Intento #2: Introduce tu número: 75
Demasiado alto. Intenta con un número menor.
Te quedan 5 intentos.
Intento #3: Introduce tu número: 63
Demasiado bajo. Intenta con un número mayor.
Te quedan 4 intentos.
Intento #4: Introduce tu número: 70
Demasiado alto. Intenta con un número menor.
Te quedan 3 intentos.
Intento #5: Introduce tu número: 68
Demasiado bajo. Intenta con un número mayor.
Te quedan 2 intentos.
Intento #6: Introduce tu número: 69
Demasiado bajo. Intenta con un número mayor.
Te quedan 1 intentos.
Intento #7: Introduce tu número: 71
¡Se acabaron los intentos! El número era: 72
```

## Customization

You can modify the following constants in the `Main.java` file to customize the game:
- `CHANCES_LIMIT`: The number of attempts allowed.
- `RANDOM_LIMIT_HIGH`: The upper limit of the random number range.
- `RANDOM_LIMIT_LOW`: The lower limit of the random number range.

## License

This project is licensed under the MIT License.
```

Replace `<repository-url>` with the actual URL of your repository.
