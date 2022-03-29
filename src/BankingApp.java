import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args){
        BankAccount obj = new BankAccount("Christy Choma", "1996");
        obj.showMenu();

    }
}

class  BankAccount{
    int balance;
    int prevTransaction;
    String customerId;
    String customerName;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            prevTransaction = amount;
        }
    }
    void withdraw(int amount){
        balance -= amount;
        prevTransaction = amount;
    }
    void getPrevTransaction(){
        if(prevTransaction > 0){
            System.out.println("Deposited: " + prevTransaction);
        }
        else if(prevTransaction < 0){
            System.out.println("Withdraw: " + Math.abs(prevTransaction) );
        }
        else{
            System.out.println("No transaction Occured");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome" +customerName);
        System.out.println("Welcome" +customerId);
        System.out.println("\n");

        System.out.println("A : Check your Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D:  Previous Transaction");
        System.out.println("E : Exit");

        do{
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("Enter Your Option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("---------------------------------------------------");
                    System.out.println("Balance = "+ balance);
                    System.out.println("---------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter an amount to deposit = ");
                    System.out.println("---------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("---------------------------------------------------");
                    System.out.println("Enter an amount to withdraw = ");
                    System.out.println("---------------------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("---------------------------------------------------");
                    getPrevTransaction();
                    System.out.println("---------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("===================================================");
                default:
                    System.out.println("Invalid Option!! Please Enter Correct Option...");
                    break;
            }
        }
        while (option !='E');
        System.out.println("Thank you for using our service");
    }
}

























