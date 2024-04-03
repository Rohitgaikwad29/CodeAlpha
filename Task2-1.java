//Online Quiz Platform (Simple Banking Application)
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sc = 0;

        while (true) {
            System.out.println("Welcome to Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    sc += depositAmount;
                    System.out.println("Deposit successful. Current sc: " + sc);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > sc) {
                        System.out.println("Insufficient funds");
                    } else {
                        sc -= withdrawAmount;
                        System.out.println("Withdrawal successful. Current sc: " + sc);
                    }
                    break;
                case 3:
                    System.out.println("Your sc: " + sc);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Banking Application");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Add a new line for better readability
        }
    }
}
