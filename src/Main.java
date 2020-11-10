import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account account = new Account("Amanov Rakhmatulla", "0000", 50000);
        Account account2 = new Account("Tolegen Yerden", "0001", 60000);
        Account account3 = new Account("Aliomar Adilbekov", "0002", 70000);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        accountList.add(account2);
        accountList.add(account3);
        BankServerProxy bankServerProxy = new BankServerProxy();
        int chose = -1;

        while (chose != 0) {
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Payment");
            System.out.println("0.Exit");

            chose = in.nextInt();

            switch (chose) {
                case 1:
                    System.out.println("Input amount of money:");
                    Integer amount = in.nextInt();
                    System.out.println("Input pin:");
                    String pin = in.next();
                    for (Account acc : accountList) {
                        if (acc.getPin().equals(pin))
                            System.out.println(bankServerProxy.Withdraw(acc, amount).sout(acc));
                    }
                    break;
                case 2:
                    System.out.println("Input amount of money:");
                    amount = in.nextInt();
                    System.out.println("Input pin:");
                    pin = in.next();
                    for (Account acc : accountList) {
                        if (acc.getPin().equals(pin))
                            System.out.println(bankServerProxy.Deposit(acc, amount).sout(acc));
                    }
                    break;
                case 3:
                    System.out.println("Input amount of money:");
                    amount = in.nextInt();
                    System.out.println("Input pin:");
                    pin = in.next();
                    for (Account acc : accountList) {
                        if (acc.getPin().equals(pin))
                            System.out.println(bankServerProxy.Payment(acc, amount).sout(acc));
                    }
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid chose!");
                    break;
            }
        }
    }
}
