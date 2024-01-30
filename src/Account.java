public class Account {
   private String name;
   private String number;
   private String creationDate;
   private double balance;
   private String type;

    public Account(String name, String number, String creationDate, double balance, String type) {
        this.name = name;
        this.number = number;
        this.creationDate = creationDate;
        this.balance = balance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + number);
        System.out.println("Creation Date: " + creationDate);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + type);

    }
}
