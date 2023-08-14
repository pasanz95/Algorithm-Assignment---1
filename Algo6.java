import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        
        System.out.print("Enter a sentence (using ASCII characters): ");
        String sentence = scanner.nextLine();
    
      
        while (sentence.isEmpty()) {
          System.out.print("The input cannot be empty. Please enter a sentence: ");
          sentence = scanner.nextLine();
        }
    
        String[] words = sentence.split(" ");
            
        for (int i = 0; i < words.length / 2; i++) {
          String temp = words[i];
          words[i] = words[words.length - i - 1];
          words[words.length - i - 1] = temp;
        }
    
        String reversedSentence = String.join(" ", words);
    
        System.out.println("The reversed sentence is: " + reversedSentence);

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }























}