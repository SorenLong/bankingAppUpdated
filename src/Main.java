import java.util.Scanner;

public class Main {

    static double amt;

    public static void main(String[] args) {

        /*
            This is a program that does simple banking application functions, viewing accounts that can be set in the
            Accounts class, making deposits, making withdrawals, applying for credit and of course exiting the program
            this code was written by Soren Long and is free to fork and edit.

         */

        //instantiate the accounts class
        Accounts ac = new Accounts();
        boolean endy = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank Of Soren");



        while (endy == false) {
            //all menu options go here
            System.out.println("Please choose a menu option (TYPE A NUMBER) from below: ");
            System.out.println("1. View accounts");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Apply for credit");
            System.out.println("5. Exit the program");
            int opt = sc.nextInt(); // this will take the menu option

            //if statement checks for option chosen
            if (opt == 1) {
                System.out.println("Your checking account has $" + ac.getCh());
                System.out.println("Your savings account has $" + ac.getSv());
                System.out.println("Your other account has $" + ac.getOt());

//######################################################################################################
//######################################################################################################
//######################################################################################################

            } else if (opt == 2) {
                //This is a menu for what account you would like to deposit to
                System.out.println("Please select an account to deposit into (TYPE A NUMBER): ");
                System.out.println("1. checking");
                System.out.println("2. savings");
                System.out.println("3. other");
                double opt2 = sc.nextInt();

                if (opt2 == 1) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    int amt = sc.nextInt() + 1000;
                    System.out.println("Your checking account now has " + amt + " Dollars!");
                } else if (opt2 == 2) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    int amt2 = sc.nextInt() + 2500;
                    System.out.println("Your savings account now has " + amt2 + " Dollars!");
                } else if (opt2 == 3) {
                    System.out.println("Please enter the amount you would like to deposit: ");
                    int amt3 = sc.nextInt() + 450;
                    System.out.println("Your other account now has " + amt3 + " Dollars!");
                }

//######################################################################################################
//######################################################################################################
//######################################################################################################

            } else if (opt == 3) {
                //This is a menu for what account you would like to withdraw from
                System.out.println("Please select an account to withdraw from (TYPE A NUMBER): ");
                System.out.println("1. checking");
                System.out.println("2. savings");
                System.out.println("3. other");
                double opt3 = sc.nextInt();

                if (opt3 == 1) {
                    System.out.println("Please enter the amount you would like to withdraw USING A NEGATIVE SYMBOL: ");
                    int amt = sc.nextInt() + 1000;
                    System.out.println("Your checking account now has " + amt + " Dollars!");
                } else if (opt3 == 2) {
                    System.out.println("Please enter the amount you would like to withdraw USING A NEGATIVE SYMBOL: ");
                    int amt2 = sc.nextInt() + 2500;
                    System.out.println("Your savings account now has " + amt2 + " Dollars!");
                } else if (opt3 == 3) {
                    System.out.println("Please enter the amount you would like to withdraw USING A NEGATIVE SYMBOL: ");
                    int amt3 = sc.nextInt() + 450;
                    System.out.println("Your other account now has " + amt3 + " Dollars!");
                }



//######################################################################################################
//######################################################################################################
//######################################################################################################

            } else if(opt==4){
                //will return a short message for credit
                System.out.println("Please enter desired credit amount: ");
                int credit = sc.nextInt();
                System.out.println("Thanks, we will get back to you with a response within the day!");

//######################################################################################################
//######################################################################################################
//######################################################################################################

            } else if (opt == 5){
                //exits the program
                System.out.println("Thanks for using the Bank Of Soren");
                System.out.println("Goodbye");
                endy = true;

//######################################################################################################
//######################################################################################################
//######################################################################################################


            } else {
                System.out.println("please choose from one of the 5 menu options");
            }



        }

        System.exit(0);

    }
}