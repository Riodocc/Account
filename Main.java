import java.lang.String;
public class Main
{
  public static void main(String[] args)
  {
    Customer c1=new Customer(1023332,"Tanvir Hossain Anik",21);

    Account a2= new Account("9320290",903209);
    Account a3=new Account("93898212",8172);
    Account a4=new Account("43897685",7345);

    c1.addAccount(a2);
    c1.addAccount(a3);
    c1.addAccount(a4);
    c1.removeAccount(a2);
    c1.showAllAccount();
    System.out.println();

   /* Account[] accounts;
    accounts = new Account[5];

      accounts[0]=new Account("7362626",10010);
      accounts[1]=new Account("9187622",23800);
      accounts[2]=new Account("8838278",40300);
      accounts[3]=new Account("4384874",50980);
      accounts[4]=new Account("6378281",60500);
      for (int i = 0; i < accounts.length; i++)
      {
          System.out.println("Element of index :"+ i  );
          System.out.println("Account No :"+accounts[i].accountNo);
          System.out.println("Balance :"+accounts[i].balance);
      }
      System.out.println();*/
      System.out.println("Customer View");
      Customer c2=new Customer();
      c2.setNid(7697543);
      c2.setName("Tanvir Hossain Anik");
      c2.getNid();
      c2.getName();
      c2.showAllAccount();
      System.out.println();

      System.out.println("This is Your Main Account");
      Account a1=new Account();
      a1.setAccountNo("8287837827");
      a1.setBalance(250000);
      a1.getAccountNo();
      a1.getBalance();
      a1.Display();
      System.out.println();

      System.out.println("This is Your Fixed Account");
      FixedAccount f1=new FixedAccount("373621",110000,2016);
      f1.setTenureYear(2016);
      f1.getTenureYear();

      f1.Display();
      System.out.println();
      System.out.println("This is Your Savings Account");
      SavingsAccount s1=new SavingsAccount("8636252",50000,15.00);
      s1.setInterestRate(15.00);
      s1.getInterestRate();
      s1.Display();

  }
}
