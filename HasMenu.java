import java.util.*;
import java.io.*:
import java.util.scanner.*;
     void Menu() {
        int choice = 0;
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome,Are you a User(1) or Admin(2)?");
     System.out.println("0. Exit.");
    
     do {
         System.out.println("Choose an option.");
         choice = scan.nextInt();
         System.out.println();
        
         switch(choice) {
        
         case 1:
            
            System.out.println("Hello User.");
            System.out.println();
            break;
            
         case 2:
            System.out.println("Hello Admin.");
            System.out.println();
            break;
            
        case 0:
            break;
            
        default:
        System.out.println("Error please choose a valid option.");
        }
      }
     
        scan.close();
     }

