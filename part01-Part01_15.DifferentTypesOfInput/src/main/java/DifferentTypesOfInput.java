import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        // Changed "scan" to "scanner" here
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give a string:");
        String text = scanner.nextLine();

        System.out.println("Give an integer:");
        int integer = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double decimal = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean logic = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + decimal);
        System.out.println("You gave the boolean " + logic);
    }
}
