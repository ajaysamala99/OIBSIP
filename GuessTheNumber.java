import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);          
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nYou Have To Guess A Number To Win The Game \nYou have Only 5 Attempts as Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
           
                userGuessNumber = sc.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("Yes!!! Your Number is Correct. You Won the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if(attempt == 5) 
                {
                    System.out.println("You have exceeded the maximum attempt. Try Again!!!");
                      System.out.println(" ");
                      System.out.println("The Secret Number is..."+secretNumber+"");
                    break;
                }
                attempt++;
            }
           
         while (userGuessNumber != secretNumber);
    }
}
 
