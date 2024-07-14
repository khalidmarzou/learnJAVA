import java.util.Scanner;

public class Conditional {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Intiger Number : ");
        int number = scanner.nextInt();

        if (number > 0 ) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is 0.");
        }
    }
}
