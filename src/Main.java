import java.text.NumberFormat;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    public String name;
    public int accountNumber;
    public static String accountType;
    public static int initialDeposit;
    public static String workType;

    public static boolean bankType = false;
    public static  int balance;
    public static int currentBalance;



    public void showAccount(){
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + initialDeposit);
        }


    public static void main(String[] args) throws InterruptedException , NullPointerException {

        int age = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to CyberBank.Inc");
        System.out.println("===========================");


        System.out.println("Are you Admin Or User?");
        String adminOrUser = scanner.nextLine();
            if (adminOrUser.equals("admin".toLowerCase())) {
                System.out.println("Please enter your Password: ");
            }
                long password = scanner.nextLong();
                while (password != 1010) {
                    System.out.println("Please enter your Password: ");
                    long password2 = scanner.nextLong();
                    if (password2 == 1010) {
                        break;
                    }
                    break;
                }

        //System.out.println("Username: ");
                String adminUsername= "username";
                System.out.println("Enter your username: ");
                adminUsername = scanner.next();

                while(!adminUsername.equals("username")) {
                    System.out.println("Please enter your username: ");
                    adminUsername = scanner.nextLine();
                }











        System.out.println("Do you want to open a new account?");
        String newAccountAnswer = scanner.nextLine();
        if (newAccountAnswer.startsWith("yes")) {
            System.out.println("Please enter your full name: ");
        } else if (newAccountAnswer.equals("no")) {
            System.out.println("Thanks for visiting our website");
            System.exit(0);
        }

        String name = scanner.nextLine().toLowerCase();

        System.out.println("Please enter your age: ");
        age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Sorry you are under the legal age limit");
            System.exit(0);
        }else {
            System.out.println("Great!");
        }



        System.out.println("===================");
        System.out.println("Ok," + name + " What type of account you want to open?");
           accountType = scanner.next();

           while (!accountType.equals("checking") && !accountType.equals("saving")) {
               System.out.println("Please enter either checking or saving!");
               accountType = scanner.next();
               }

        System.out.println("Great!");
//                 accountType= scanner.next();
//                    if(accountType.equals("checking || saving")){
//                        System.out.println("Great");
//                        break;
               // accountType = scanner.next();









        System.out.println("What do you do for a living?");
        workType = scanner.next();

        System.out.println("How much do you want to deposit into your new account: ?");
        int initialDeposit = scanner.nextInt();

        System.out.println("Kindly wait...");
        Thread.sleep(3000);
        System.out.println("Congratulation, here is your new account details: ");
        System.out.println("============================");
        int  accountNumber = age*2001;
        System.out.println("Your name is: " + name);
        System.out.println("Your account type is: " + accountType);
        System.out.println("Your account number is: " + accountNumber);
        System.out.println("====================================");
        System.out.println("To see your account balance, enter (yes)");
        String seeAccountBalance = scanner.next().toLowerCase();
                if (seeAccountBalance.equals("yes")){
                    System.out.println("Your account balance is " + NumberFormat.getCurrencyInstance().format(initialDeposit));
                    }else if(seeAccountBalance.equals("no")){
                    System.out.println("Thanks for your business.");
                }
        System.out.println();
        System.out.println("Please choose one of the following options: ");
        Thread.sleep(3000);
        System.out.println("Deposit");
        System.out.println("Withdraw");
        System.out.println("Exit");
        String depositWithdrawUserAnswer = scanner.next();

        switch (depositWithdrawUserAnswer) {
            case "Deposit" -> {
                System.out.println("Please enter a new deposit amount: ");
                 balance = scanner.nextInt();

//                Deposit deposit = new Deposit();
//                deposit.setCurrentBalance();
//                deposit.getCurrentBalance();
                currentBalance = balance+ initialDeposit;
                //int currentBalance = balance + initialDeposit;
                System.out.println("To see your currentBalance, please enter your account number: ");
                int userAccountNumberEntry = scanner.nextInt();

                    if(userAccountNumberEntry == accountNumber){
                        System.out.println("Your current Balance in your account is: " + NumberFormat.getCurrencyInstance().format(currentBalance));
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
            case "Withdraw" -> {
                System.out.println("Please enter the amount you want to withdraw: ");
                int withdraw = scanner.nextInt();
                long currentBalanceAfterWithdraw=0;
                if (withdraw > initialDeposit && withdraw > currentBalance) {
                    System.out.println("You have insignificant funds in your account");

                }else if (withdraw < initialDeposit) {
                    currentBalanceAfterWithdraw = initialDeposit - withdraw;
                }else if (withdraw < currentBalance){
                    currentBalanceAfterWithdraw = currentBalance- withdraw;
                }
                System.out.println("To see your currentBalance, please enter your account number: ");
                int userAccountNumberEntry = scanner.nextInt();
                    if(userAccountNumberEntry == accountNumber){
                        System.out.println("Your current Balance in your account is: " + NumberFormat.getCurrencyInstance().format(currentBalanceAfterWithdraw));
                }

            }
            case "Exit" -> {
                System.out.println("Thanks for your business");
                System.exit(0);
            }
        }
    

    }

}
