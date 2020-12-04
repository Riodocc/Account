import java.lang. *;
public class FixedAccount extends Account
{
    int tenureYear;

    FixedAccount()
    {

    }
    FixedAccount( String accountNo,double balance,int tenureYear)
    {
        super(accountNo,balance);
        this.tenureYear=tenureYear;
    }
    void setTenureYear(int tenureYear)
    {
        this.tenureYear=tenureYear;
    }

    public int getTenureYear()
    {
        return tenureYear;
    }

    public void Display()
    {
        super.Display();
        System.out.println("Tenure Year :" +tenureYear);
    }
}

