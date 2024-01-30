import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();


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
                    System.out.print("Enter account holder's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter creation date: ");
                    String creationDate = scanner.nextLine();
                    System.out.print("Enter opening balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter account type (current/savings/salary): ");
                    String type = scanner.nextLine();
                    bank.createAccount(name, number, creationDate, balance, type);
                }
                else if (choice == 2) {
                    //display
                    bank.displayAllAccounts();
                }
                else if (choice == 3) {
                    //update
                    System.out.println("Enter account Number : ");
                    String number = scanner.nextLine();
                    System.out.println("Enter new balance: ");
                    double newBalance = scanner.nextDouble();

                    bank.updateAccount(number, newBalance);
                }
                else if (choice == 4) {
                    //delete
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();

                    bank.deleteAccount(number);
                }
                else if (choice == 5) {
                    //deposit
                    System.out.println("Enter account Number : ");
                    String number = scanner.nextLine();
                    System.out.println("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();

                    bank.deposit(number, amount);
                }
                else if (choice == 6) {
                    //withdraw
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();

                    bank.withdraw(number, amount);
                }
                else if (choice == 7) {
                    //search
                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();
                    bank.searchAccount(number);
                }
                else if (choice == 8) {
                    //exit
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