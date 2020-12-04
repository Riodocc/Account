import java.lang. *;
public class Account
{
   // int i;
    String accountNo;
    double balance;
    Account()
    {

    }
    Account(String accountNo,double balance)
    {
        this.accountNo=accountNo;
        this.balance=balance;
    }
    void setAccountNo(String accountNo)
    {
        this.accountNo=accountNo;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    String getAccountNo()
    {
        return accountNo;
    }

    public double getBalance()
    {
        return balance;
    }
    public void Display()
    {
        System.out.println("Account No :"+accountNo);
        System.out.println("Balance :"+balance);
    }
}

