import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n Banking Menu:");
                System.out.println("1. Create a new account");
                System.out.println("2. Display all accounts");
                System.out.println("3. Update an account");
                System.out.println("4. Delete an account");
                System.out.println("5. Deposit an amount into your account");
                System.out.println("6. Withdraw an amount from your account");
                System.out.println("7. Search for an account");
                System.out.println("8. Exit");

                System.out.print("Enter your choice (1-8): ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                   //create
                }
                else if (choice == 2) {
                    //display
                }
                else if (choice == 3) {
                    // update
                }
                else if (choice == 4) {
                    // delete
                }
                else if (choice == 5) {
                    // deposit
                }
                else if (choice == 6) {
                    //  withdraw
                }
                else if (choice == 7) {
                    //  search
                }
                else if (choice == 8) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();

    }
}