import java.util.ArrayList;
import java.util.List;

public class Account {
    private String fullname;
    private String pin;
    private Integer amount;
    List<Transaction> transactionList=new ArrayList<>();

    public Account() {
    }

    public Account(String fullname, String pin, Integer amount) {
        this.fullname = fullname;
        this.pin = pin;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void makeTransaction(Transaction transaction){
        transactionList.add(transaction);
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}
