package Account;

import java.util.Scanner;

public class Account extends Bank {
 int Balance;
 int Previoustransaction;
 int amount;
 int amount2;
 String Name;
 String ID;

 Account(String Name,String ID){
    
 }
 void deposit(int amount) {
    if (amount != 0) {
        Balance+=amount;
        Previoustransaction=amount;
     }
   }
   void withdraw(int amount) {
     if(amount!=0) {
        Balance-=amount;
        Previoustransaction = -amount;
     } 
        }
   void getPrevioustransaction() {
      if(Previoustransaction > 0) {
        System.out.println("Deposited:" + Previoustransaction);
     }
     else if(revioustransaction<0) {
        System.out.println("Withdrawn:" + Math.abs(Previoustransaction));
     }  else {
        System.out.println("No transaction occurred.");     
     }
    }
      void Menu() {
        int choice = 0;
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome," + Name + ".");
     System.out.println("Your account number is" + ID);
     System.out.println("What would you like to do?");
     System.out.println("1.Check balance.");
     System.out.println("2. Make a deposit.");
     System.out.println("3. Make a withrawl.");
     System.out.println("4. Show last transaction.");
     System.out.println("0. Exit.");
    
     do {
         System.out.println("Choose an option.");
         choice = scan.nextInt();
         System.out.println();
        
         switch(choice) {
        
         case 1:
            
            System.out.println("Balance = $" + Balance);
            System.out.println();
            break;
            
         case 2:
            System.out.println("Enter an amount to deposit.");
            int amount = scan.nextInt();
            deposit (amount);
            System.out.println();
            break;
            
        case 3:
            System.out.println("Enter an amount to withdrawl.");
            int amount2 = scan.nextInt();
            withdraw(amount2);
            break;
            
        case 4:
            getPrevioustransaction();
            break;
            
        case 0:
            break;
            
        default:
        System.out.println("Error -- Please choose a valid option.");
        }
      } while (choice != 0);
        System.out.println("Thank you for using the Bank Account Tracker!");
        
        scan.close();
      

}
