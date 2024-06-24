
public class CurrentAccount extends Account{


    public CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void printInfo() {
        System.out.println();
        System.out.println("Current Account >> ");
        super.printTrivialInfo();
    }

}
