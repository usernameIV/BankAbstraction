public interface iAccount {

    void withdraw();
    void deposit();
    void transfer(double value, Account receiverAccount);
    void printInfo();
    void receive(double value);

}
