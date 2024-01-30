import java.util.ArrayList;

public class Bank{
    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String name, String number, String creationDate, double balance, String type) {

        double minimumBalance = getMinBalanceForAccountType(type);
        if(balance< minimumBalance){
            System.out.println("Failed to create account. Minimum balance required for " + type + " account is: " + minimumBalance);
            return;
        }

        accounts.add(new Account(name, number, creationDate, balance, type));
        System.out.println("Account created successfully.");
        System.out.println("Your account Number: " + number );
    }

    private double getMinBalanceForAccountType(String type) {
        switch (type){
            case "current":
                return 5000;
            case "savings":
                return 2500.0;
            case "salary":
            default:
                return 0.0;
        }
    }

    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.display();
            System.out.println();
        }
    }

    public void updateAccount(String number, String newName){
        for(Account account : accounts){
            if(account.getNumber().equals(number)){
                account.setName(newName);
                System.out.println("Account Updated Successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void deleteAccount(String number){
        for(Account account : accounts) {
            if (account.getNumber().equals(number)) {
                accounts.remove(account);
                System.out.println("Account deleted Successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void deposit(String number, double amount){
        for(Account account : accounts){
            if(account.getNumber().equals(number)){
                account.setBalance(account.getBalance() + amount);
                System.out.println("Amount deposited successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(String number, double amount) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                if (account.getBalance() >  amount) {
                    account.setBalance(account.getBalance() - amount);
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void searchAccount(String number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                account.display();
                return;
            }
        }
        System.out.println("Account not found.");
    }




}
