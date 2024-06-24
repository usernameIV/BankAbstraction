import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client();
        client1.setName("Danton");
        Account crt = new CurrentAccount(client1);
        Account sav = new SavingsAccount(client1);

//      Operating on account


//      Then printing the new info

            Scanner scanner_d = new Scanner(System.in);
            Scanner scanner_l = new Scanner(System.in);

            System.out.println("Welcome to the library system");
            boolean exit = false;
            do {
                try {
                    System.out.println("=======================");
                    System.out.println("==     Main Menu     ==");
                    System.out.println("=======================");
                    System.out.println(" 1 ⮞ Current account");
                    System.out.println(" 2 ⮞ Savings account");
                    System.out.println(" 0 ⮞ Quit");

                    int escolha = scanner_d.nextInt();
                    boolean exitSub = false;
                    switch (escolha) {
                        case 1:
                            while (!exitSub) {
                                try {
                                    System.out.println("=======================");
                                    System.out.println("==     Main Menu     ==");
                                    System.out.println("=======================");
                                    System.out.println(" 1 ⮞ Withdraw matters");
                                    System.out.println(" 2 ⮞ Deposit matters");
                                    System.out.println(" 3 ⮞ Transfer matters");
                                    System.out.println(" 4 ⮞ Print info");
                                    System.out.println(" 0 ⮞ Back");

                                    int Sub = scanner_d.nextInt();
                                    switch (Sub) {
                                        case 1:
                                            crt.withdraw();
                                            break;
                                        case 2:
                                            crt.deposit();
                                            break;
                                        case 3:
                                            System.out.println("Insert the value you want to transfer:");
                                            double value = scanner_d.nextDouble();
                                            crt.transfer(value, sav);
                                            break;
                                        case 4:
                                            crt.printInfo();
                                            break;
                                        case 0:
                                            System.out.println("Back to main menu! :D");
                                            exitSub = true;
                                            break;
                                        default:
                                            System.out.println("Invalid option");
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input, please try again.");
                                    scanner_d.next();
                                }
                            }
                            break;
                        case 2:
                            while (!exitSub) {
                                try {
                                    System.out.println("=======================");
                                    System.out.println("==     Main Menu     ==");
                                    System.out.println("=======================");
                                    System.out.println(" 1 ⮞ Withdraw matters");
                                    System.out.println(" 2 ⮞ Deposit matters");
                                    System.out.println(" 3 ⮞ Transfer matters");
                                    System.out.println(" 4 ⮞ Print info");
                                    System.out.println(" 0 ⮞ Back");

                                    int Sub = scanner_d.nextInt();
                                    switch (Sub) {
                                        case 1:
                                            sav.withdraw();
                                            break;
                                        case 2:
                                            sav.deposit();
                                            break;
                                        case 3:
                                            System.out.println("Insert the value you want to transfer:");
                                            double value = scanner_d.nextDouble();
                                            sav.transfer(value, crt);
                                            break;
                                        case 4:
                                            sav.printInfo();
                                            break;
                                        case 0:
                                            System.out.println("Back to main menu! :D");
                                            exitSub = true;
                                            break;
                                        default:
                                            System.out.println("Invalid option");
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Invalid input, please try again.");
                                    scanner_d.next();
                                }
                            }
                            break;
                        case 0:
                            System.out.println("Exiting...");
                            exit = true;
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("That's not an option");
                    scanner_l.next();
                }
            } while (!exit);
    }
}
