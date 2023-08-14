import java.util.Scanner;

public class Algo5 {
     private static final Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {
   

        System.out.print("Enter a text (ASCII only): ");
        String text = scanner.nextLine();
    
        
          while (text.isEmpty()) {
          System.out.print("The input cannot be empty. Please enter a text: ");
          text = scanner.nextLine();
        }


        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
          reversedText += text.charAt(i);
        }
        System.out.println("The reversed text is: " + reversedText);








    }

}