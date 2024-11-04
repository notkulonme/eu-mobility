import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your username: ");
        final var scanner = new Scanner(System.in);
        final var userName = scanner.nextLine();
        System.out.printf("Hello, %s!%n", userName);
    }
}