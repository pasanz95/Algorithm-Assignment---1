import java.util.Scanner;

public class Algo1{

private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
       

    int userInput;
    do {
        System.out.print("Enter a positive number: ");
        userInput = scanner.nextInt();


        if (userInput <= 0) {
            System.out.println("Please enter a positive number.");
        }
    } while (userInput <= 0);
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber = 0;

    System.out.print("Fibonacci sequence up to " + userInput + ": " + firstNumber);

    do {
        System.out.print(", " + secondNumber);
        nextNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextNumber;
    } while (nextNumber <= userInput);

    System.out.println();

}
}