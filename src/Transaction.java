import java.util.Date;

public class Transaction {
    private Date date;
    private String payer;
    private Integer amount;
    private String type;

    public Transaction(Date date, String payer, Integer amount, String type) {
        this.date = date;
        this.payer = payer;
        this.amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String sout(Account account) {
        return  "Type:"+type+"\n"+
                "Payer:"+payer+"\n"+
                "Date:"+date+"\n"+
                "Amount:"+amount+"\n"+
                "Balance:"+account.getAmount()+"\n";
    }
}
