import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Código inicial que será ampliado por los desarrolladores
        System.out.println("Bienvenido a la Calculadora Básica.");
        System.out.println("Ingrese el primer número para la suma:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la suma:");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("El resultado de la suma es: " + result);

        scanner.close();
    }
}
