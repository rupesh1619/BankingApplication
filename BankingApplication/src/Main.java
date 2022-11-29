import com.bankapplication.pack.UserDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
CREATE ACC001 KELP
DEPOSIT ACC001 10000
WITHDRAW ACC001 1000
CREATE ACC002 FVTPL
DEPOSIT ACC002 10000
WITHDRAW ACC002 2000
BALANCE ACC002
BALANCE ACC001
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        // create a HashMap to store account_details(user & userDetails)
        Map<String, UserDetails> account_details = new HashMap<>(1);

        /* run loop infinitely.
         * IF command = 1 -> CREATE
         * IF command = 2 -> DEPOSIT
         * IF command = 3 -> WITHDRAW
         * IF command = 4 -> CHECK BALANCE
         * IF command = 5 -> EXIT APPLICATION
         */
        for (;;) {
            int create_command = 1;
            int deposit_command = 2;
            int withdraw_command = 3;
            int balance_command = 4;
            int exit = 5;

            System.out.println("Choose Action: \n 1. Create Account. \n 2. Deposit Amount. \n 3. Withdraw Amount. \n 4. Balance.  \n 5. Exit.");
            int command = sc.nextInt();

            if(command == exit){ // EXIT THE APPLICATION
                break;
            }

            // CREATE USER
            if (command == create_command) {
                // ask user to enter UserCode and UserName
                System.out.println("Enter UserCode: ");
                String userCode = sc1.nextLine();

                System.out.println("Enter UserName: ");
                String userName = sc1.nextLine();

                // set default value for the attributes
                int account_balance = 0;
                int deposit = 0;
                int withdraw = 0;

                if (userName != null || userCode != null) {
                    account_details.put(userCode, new UserDetails(userName, account_balance, deposit, withdraw));
                    // System.out.println(account_details);
                } else {
                    System.out.println("Please enter valid userName or userCode");
                }
            } else if (command == deposit_command) { // DEPOSIT AMOUNT
                // ask user to enter UserCode and amount to be deposited
                System.out.println("Enter UserCode: ");
                String userCode = sc1.nextLine();
                System.out.println("Enter Deposit Amount: ");
                int deposit = sc.nextInt();

                // get userName and account_bal corresponding to the userCode
                String userName = account_details.get(userCode).getUserName();
                int account_bal = account_details.get(userCode).getAccount_balance();

                // after entering the deposit add that amount to the current account_balance.
                account_details.put(userCode, new UserDetails(userName, account_bal + deposit, deposit, 0));
                // String user_details = String.valueOf(account_details.get(userCode));
                // System.out.println(user_details);
            } else if (command == withdraw_command) { // WITHDRAW AMOUNT
                // ask user to enter UserCode and amount to be withdrawn
                System.out.println("Enter UserCode: ");
                String userCode = sc1.nextLine();
                System.out.println("Enter Withdrawal Amount: ");
                int withdraw = sc.nextInt();

                // get userName and account_bal corresponding to the userCode
                String userName = account_details.get(userCode).getUserName();
                int account_bal = account_details.get(userCode).getAccount_balance();

                // after entering the amount to be withdrawn subtract the withdrawn amount from current account balance.
                account_details.put(userCode, new UserDetails(userName, account_bal - withdraw, 0, withdraw));
                // String user_details = String.valueOf(account_details.get(userCode));
                // System.out.println(user_details);
            } else if (command == balance_command) { // CHECK BALANCE
                System.out.println("Enter UserCode: ");
                String userCode = sc1.nextLine();
                System.out.println(account_details.get(userCode).getUserName() + " " + account_details.get(userCode).getAccount_balance());
            }
        }
    }
}
