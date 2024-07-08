/*
package accountopeningproject;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu  extends AccountOpening{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    //Validate Login information customer number and pin number

    public void getLogin() throws IOException{
        int x = 1;

        do {
            try{
                data.put(98765432, 9876);
                data.put(98765431, 4321);
                data.put(98765430, 3210);
                data.put(98765439, 2109);
                System.out.println("Welcome to the ATM project");

                System.out.println("Enter your customer number ");
                setCustomerNumber (menuInput.nextInt());

                System.out.println("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e){
                System.out.println("\n" + "Invalid character(s). only numbers."+"\n");
                        x = 2;
            }
            for (HashMap.Entry<Integer,Integer> entry : data.entrySet()){
                if (entry.getKey() == getCustomerNumber()&& entry.getValue()== pinNumber){

                    getAccountType();
            }
        }
        System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
    }while (x==1);
}
  // Display Account Type Menu with Selection
public void getAccountType() {
    System.out.println("Select the Account you want to access: ");
    System.out.println("Type 1 - Checking Account");
    System.out.println("Type 2 - Saving Account");
    System.out.println("Type 3 - Exit");
    System.out.println("Choice: ");

    selection = menuInput.nextInt();

    switch (selection) {
        case 1:
            getChecking();
            break;
        case 2:
            getSaving();
            break;
        case 3:
            System.out.println("Thank you for using this ATM,bye.");
        default:
            System.out.println("\n" + "Invalid Choice." + "\n");
            getAccountType();
    }
}

   //Display Checking Account Menu with selections

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();
        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getChecking()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawlInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye");
            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getChecking();
        }
    }

       //Display saving Account menu with selections

    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - view Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 4 - Deposit Founds");
        System.out.println("Choice");

        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, bye. ");
                break;
            default:
                System.out.println("\n" + "Invalid choice. " + "\n");
        }
    }
    int selection;
}

*/
