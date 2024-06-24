
public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printInfo() {
        System.out.println();
        System.out.println("Saving Account >> ");
        super.printTrivialInfo();
    }

}
