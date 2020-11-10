import java.util.Date;

public class BankServerProxy implements  IBankServer {

    @Override
    public Transaction Withdraw(Account account, Integer i) {
        if (account.getAmount()>i)
            account.setAmount(account.getAmount()-i);
        else
            System.out.println("Not enough money!");
        Transaction transaction=new Transaction(new Date(),account.getFullname(),i,"Withdraw");
        account.makeTransaction(transaction);
        return transaction;
    }

    @Override
    public Transaction Deposit(Account account, Integer i) {
        account.setAmount(account.getAmount()+i);
        Transaction transaction=new Transaction(new Date(),account.getFullname(),i,"Deposit");
        account.makeTransaction(transaction);
        return transaction;
    }

    @Override
    public Transaction Payment(Account account, Integer i) {
        if (account.getAmount()>i)
            account.setAmount(account.getAmount()-i);
        else
            System.out.println("Not enough money!");
        Transaction transaction=new Transaction(new Date(),account.getFullname(),i,"Payment");
        account.makeTransaction(transaction);
        return transaction;
    }

}
