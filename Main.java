import java.util.Scanner;

class ATM{
    float balance;
    int pin = 5674;
    public void menu(){
        System.out.println("Choose any one in this four options according a number");
        System.out.println("1.Check Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withDrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return ;
        }
        else{
            System.out.println("Please Enter a valid choice");
            menu();
        }

    }
    void enterPin(){
        System.out.println("Again Enter Pin");
        checkPin();
    }
   void  checkPin(){
       System.out.println("Enter your pin:");
       Scanner sc = new Scanner(System.in);
       int enterPin = sc.nextInt();
        if(enterPin == pin){
           menu();
       }
       else{
           System.out.println("You enter the Invalid pin! Try again ");
           enterPin();
       }
   }
   void checkBalance(){
       System.out.println("Your Bank Balance is :"+balance);
       menu();
   }

    void withDrawMoney(){
        System.out.println("Enter amount to withdraw money: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance ){
            System.out.println("InSufficient Balance");
        }
        else{
            balance = balance-amount;
            System.out.println("WithDraw money is successful");

        }
        menu();
    }
    void depositMoney(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance+amount;
        System.out.println("Money deposited Successfully");
        menu();
    }
}

public class Main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}