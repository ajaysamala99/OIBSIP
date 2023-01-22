import java.util.Scanner;
public class ATM_Transaction
{
    public static void main(String args[] )
    { 
        int balance = 0;int  withdraw, deposit,pin;
        Scanner s = new Scanner(System.in);
        System.out.println("----Generate The PIN----");
         System.out.println("Create a 4 digit Pin");
        pin = s.nextInt();
         System.out.println("----your PIN has Generated Successfully----");
        
        while(true)
        {
            System.out.println("  ");
            System.out.println("*****Automated Teller Machine*****");
              System.out.println("  ");
            System.out.println(">>Select an Operation you want to perform:<<");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.EXIT");
            
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("-----Enter money to be withdrawn:-----");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    System.out.println("----Enter the pin----");
                    int t = s.nextInt();
                    if(t == pin)
                    {    
                    balance = balance - withdraw;
                     System.out.println(" ");
                    System.out.println(">>>>>Please collect your money<<<<<");
                    System.out.println("\n");
                    System.out.println("----Yours balance is "+balance+"----");
                    }
                    else
                    {
                    System.out.println("----You Have Entered Invalid PIN----\n>>Please Enter valid PIN");
                    break;
                    }
                }
                else
                {
                      System.out.println("  ");
                    System.out.println("~~~~Insufficient Balance~~~~");
                      System.out.println("  ");
                    System.out.println("Your Balance is: "+balance);
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                 System.out.println("Enter the PIN");
                    int t = s.nextInt();
                    if(t == pin)
                {
                balance = balance + deposit;
                System.out.println("~~~Your Money has been successfully depsited~~~");
                  System.out.println("  ");
                System.out.println("   ---Yours balance is "+balance+"---");
                break;
                }
                 else
                    {
                    System.out.println("Please Enter valid PIN");
                    break;
                    }
 
                case 3:
                 System.out.println("Enter the pin");
                    t = s.nextInt();
                    if(t == pin)
                {
                System.out.println("Your Balance is: "+balance);
                System.out.println("");
                break;
                }
                else
                    {
                    System.out.println("Please Enter valid PIN");
                    break;
                    }
                case 4:
                System.exit(0);
            }
        }
    }
}