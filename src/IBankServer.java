public interface IBankServer {
    public Transaction Withdraw(Account account, Integer i);
    public Transaction Deposit(Account account, Integer i);
    public Transaction Payment(Account account, Integer i);
}
