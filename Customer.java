import java.lang.String;
public class Customer
{
    int nid;
    String name;
    Account account[];
    Account[] accounts;

    Customer()
    {

    }
    Customer(int nid,String name,int size)
    {
        this.nid=nid;
        this.name=name;
        this.accounts=new Account[size];

    }
    void setNid(int nid)
    {
        this.nid=nid;
    }
    void setName(String name)
    {
        this.name=name;
    }

    public int getNid()
    {
        return nid;
    }
    public String getName()
    {
        return name;
    }
    public void addAccount(Account a)
    {
      for(int i=0;i<accounts.length;i++)
      {
          if(accounts[i]==null)
          {
              accounts[i]=a;
              break;
          }
          else
          {
              continue;
          }
      }
    }
    void removeAccount(Account a)
    {
        for(int i=0;i<accounts.length;i++)
        {
            if(accounts[i]==a)
            {
               accounts[i]=null;
               break;
            }
            else
            {
                continue;
            }
        }

    }
    public void showAllAccount()
    {
        System.out.println("National ID is :"+ nid);
        System.out.println("Account Holder Name is :" + name);

    }

}
