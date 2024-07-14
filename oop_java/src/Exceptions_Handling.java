import java.io.*;

public class Exceptions_Handling {
    
    public static void readFile() {

        try {
            FileReader file = new FileReader("file.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // print the first line of the file :

            System.out.println(fileInput.readLine());
            fileInput.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found");
        } catch (IOException e) {

            System.out.println("error in reading the file");
        } finally {
            
            System.out.println("Handling finished");
        }
    }


    // example of throws errors :

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18");
        } else {
            System.out.println("Access granted.");
        }
    }
}
