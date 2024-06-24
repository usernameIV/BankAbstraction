import java.util.Scanner;

public class Account implements iAccount{

    protected static final Scanner s = new Scanner(System.in);
    protected static final int DEFAULT_AGENCY = 10;
    protected static int SEQUENCIAL = 100;

    protected int agency;
    protected int id;
    protected double balance;
    private Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.id = Account.SEQUENCIAL += 4;
        this.client = client;

    }
    @Override
    public void withdraw() {
        double value;
        System.out.println("Withdraw chose -> ");
        System.out.println("Insert value to withdraw: ");
        value = s.nextDouble();
        balance -= value;
    }

    @Override
    public void deposit() {
        double value;
        System.out.println("Deposit chose -> ");
        System.out.println("Insert value to deposit: ");
        value = s.nextDouble();
        balance += value;
    }
    @Override
    public void receive(double value) {
        balance += value;
    }
    @Override
    public void transfer(double value, Account receiverAccount) {
        receiverAccount.receive(value);
    }

    @Override
    public void printInfo() {

    }

    protected void printTrivialInfo() {
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Account ID: %d", this.id));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }
    public int getAgency() {
        return agency;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
