public class Account {

    private double balance;
    private String name;

    private static int count = 0;

    public Account() {
        this.balance = 0.0;
        this.count++;

    }

    public Account(double startBalance) {
        this.balance = startBalance;
        this.count++;
    }

    public void Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }



    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        //balance = balance + amount; = ett annat sätt att skriva

    }

    public double withdraw(double amount)  {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;

        }
        return 0;

    }
}
