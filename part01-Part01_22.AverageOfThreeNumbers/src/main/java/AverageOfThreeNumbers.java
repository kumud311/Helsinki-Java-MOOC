
import java.util.scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number: ");
        int third = Integer.parseInt(scanner.nextLine());
        double average = (first + second + third)/2.0;
        System.out.println("The average is " + average );
        
    }
}
