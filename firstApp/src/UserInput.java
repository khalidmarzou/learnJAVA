import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is ur name ?");
        String name = scanner.nextLine();
        System.out.println("How old are U ?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food ?");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your favorite food is : " + food);
        
    }
}
