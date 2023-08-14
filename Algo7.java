import java.util.Scanner;

public class Algo7 {
     private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
          
            String input;
        do{
            System.out.print("Enter a sentence.: ");
            input = scanner.nextLine().strip();
        }while(input.isBlank());

        String[] words = input.split("\\s+");
        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            int shortestLength = shortestWord.length();
            int longestLength = longestWord.length();
    
            System.out.println("Shortest word: "+ shortestWord + " (Length: " + shortestLength + ")");
            System.out.println("Longest word: " + longestWord + " (Length: " + longestLength + ")");









        }



    }
}