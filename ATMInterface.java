import java.util.Scanner;
public class ATMInterface{
    public static void main(String args[]) {
      int balance=20000;
      int withdraw;
      int deposit;

      Scanner sc = new Scanner (System.in);

      while(true){
        System.out.println("Automated Tellor Machine is now Activated");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit ");
        System.out.println("Choose the opewration you want to perform");

        int options = sc.nextInt();  
            switch(options)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        withdraw = sc.nextInt();  
        
        if(balance >= withdraw){ 
             balance = balance - withdraw;  
            System.out.println("Please collect your money!!");  
        }  
        else{  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
        case 2: 
        System.out.print("Enter money to be deposited:");  
        deposit = sc.nextInt();  
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
        case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
        case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  


