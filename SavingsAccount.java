import java.lang. *;
public class SavingsAccount extends Account
{
    double interestRate;
    SavingsAccount()
    {

    }
    SavingsAccount(String accountNo,double balance,double interestRate)
    {
        super(accountNo, balance);
        this.interestRate=interestRate;
    }
    void setInterestRate(double interestRate)
    {
        this.interestRate=interestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }
    public void Display()
    {
        super.Display();
        System.out.println("Interest Rate :" +interestRate);
    }
}