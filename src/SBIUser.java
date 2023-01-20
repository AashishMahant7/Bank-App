import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
   private String name;
    private String accountNo;
   private double balance;
   private String password;
    private  double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());

    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "terko balance dikh rha h kya?"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "aukat m aa ja";
            }
            else {
                balance=balance+amount;
                return "paisa he paisa ";
            }
        }
        else {
        return "Tera he account hai na";
    }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
