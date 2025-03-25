import java.util.Scanner;Would you like to make a (1)Deposit

class Main {
  public static void main(String[] args) {
    Scanner money = new Scanner(System.in);
    {
      System.out.println(" ");
      System.out.printf( "Current Balance: ",+ this);
      System.out.println(" ");
      System.out.println("What would you like to do:");
      System.out.println("Would you like to make a [1] [Deposit]");
      System.out.println("Would you like to make a [2] [WITHDRAWAL]");
      System.out.println("Type [3] for [EXIT/FINAL]");
      choice = money.nextInt();

      System.out.println();
      System.out.println("Please enter 0-3:  ");
      String result = input.nextline
    
     
     
     
      if(choice == 1)
      {
        System.out.print("Amount: ");
        dep = money.nextInt();
        deposit(balance, dep);
        System.out.println(" " + balance);
      }
      else if(choice == 2)
      {
        System.out.print("Amount: ");
        with = moneyTime.nextInt();
        withdrawl(balance, with);
        System.out.println("Testing2: " + balance);
      }
      else
      {
        exitORfinal();
      }
    }

    static int deposit(int balance, int dep)
    {
    int balance1 = balance + dep;
    return balance1;
    }

    static int withdrawal(int balance, int with)
    {
    int balance1 = balance - with;
    return balance1;
    }

    static int exitORfinal
    {
    System.out.println("");
    }

  }
}
