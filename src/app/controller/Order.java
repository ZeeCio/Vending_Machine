package app.controller;
import app.dao.Calculator;
import app.dto.DataEngine;
import app.model.ItemsClass;
import app.view.UIengine;
import app.view.UIview;

import java.util.Scanner;

import static app.dao.Calculator.calculateChange;


public class Order extends ItemsClass {


    private static UIview ui = new UIview();
    private static DataEngine data = new DataEngine();

    private static int inputTotal = 0;


    public static void menu() {

        int choice = ui.menuAndGet();

        for (ItemsClass item : data.itemsRecord) {
            if (choice == item.getItemNumber()) {
                String productWanted = item.getItemName();    // holds product name
                int price = item.getItemPrice();         // holds price

                String temp = Integer.toString(price);
                String forPrint = temp.charAt(0)+ "." + temp.charAt(1) + temp.charAt(2);
                System.out.println("The price of " + productWanted + " is: " + forPrint);  // Display product and price

                // ArrayList<Integer> paidIn = new ArrayList<>();
                // int inputTotal = 0;

                do {
                    ui.askForCoinsMessage();   // Instructions how to insert coins
                    Scanner scan = new Scanner(System.in);
                    inputTotal = scan.nextInt();
                    if (inputTotal < 0) {
                        ui.insufficientMessage();
                        System.out.println("Insert more money");
                        inputTotal = scan.nextInt();                                 // requests more money
                    } else {
                        // int insertedMoney = convertAmountToInt(inputTotal);

                        if (inputTotal > price) {                                   // if inserted money are more - takes to change calculations steps
                            int changeGeneral = inputTotal - price;                 // Change in total
                            int[] change = calculateChange(changeGeneral);          // Holding returned array with the change coins
                            UIview.displayChangeMessage(change);                    // Displays change coins
                            UIengine.giveItem();                                    // Displays message - Please collect the product
                            data.keepRecordOnFile();                                     // Saves a copy of purchase
                            menu();                                                 // return to the beginning of the menu()
                        } else if (inputTotal == price) {                           // if inserted money are enough just release product
                            UIengine.giveItem();
                            data.keepRecordOnFile();
                        } else {
                            ui.insufficientMessage();                                  // Message that money are not enough - restarts menu
                            menu();
                        }

                    }

                } while (inputTotal >= 0);                                         // do - while inserted money are more or equal, if -1 -exit
                System.exit(0);

            }
        }

    }



}


