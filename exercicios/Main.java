import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baseYear = 2024;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = scanner.next();

        System.out.println("Informe o seu ano de nascimento:");
        int year = scanner.nextInt();

        int age = baseYear - year;

        System.out.printf("Olá %s, você tem %d anos.%n", name, age);
    }
}

