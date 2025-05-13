import java.util.Scanner;

public class ReadUserInputScanner{
    public static void main(String[] args) {
        System.out.println(getScannerInput(2025));
    }
    public static String getScannerInput(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("What is your Birth year? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear-Integer.parseInt(dateOfBirth);
        return "So, you are "+age+" years old";

    }
}