import java.util.ArrayList;

public class Bank{
    private ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String name, String number, String creationDate, double balance, String type) {
        accounts.add(new Account(name, number, creationDate, balance, type));
        System.out.println("Account created successfully.");
        System.out.println("Your account Number: " + number );
    }

    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.display();
            System.out.println();
        }
    }

    public void updateAccount(String number, double newBalance){
        for(Account account : accounts){
            if(account.getNumber().equals(number)){
                account.setBalance(newBalance);
            }
        }
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
