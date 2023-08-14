import java.util.Scanner;

public class Algo10 {
     private static final Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            String phoneNumber;
        do {
            System.out.print("Enter a phone number: ");
            phoneNumber = scanner.nextLine().trim();
            if (phoneNumber.isEmpty()) {
                System.out.println("Telephone number can't be empty. Please enter it again.");
            }
        } while (phoneNumber.isEmpty());

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Number is validated.");
        } else {
            System.out.println("Invalid phone number.");
        }
    }
    private static boolean isValidPhoneNumber(String phoneNumber) {
        return false;
    
    
    
    
    
    
    
    
    
    
    
    
    }








    }
