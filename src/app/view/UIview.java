package app.view;
import static app.view.UIengine.readProductRange;


public class UIview {

    public static boolean isON = true;

    public static int menuAndGet() {
        System.out.println("______________________");
        System.out.println("*** Vending Machine ***");
        System.out.println("");
        System.out.println("----- MENU ------");
        System.out.println("");

        System.out.println("1.COKE      - £1.20    2.PEPSI   - £1.30     3.WATER  - £0.90");
        System.out.println("4.SNICKERS  - £0.70    5.BOUNTY  - £0.60     6.TWIX   - £0.50");
        // System.out.println("7.EXIT");
        System.out.println("_______________________");
        System.out.println("");

        return readProductRange ("Please type your choice:", 1, 6);
    }

    public static void askForCoinsMessage() {
        System.out.println("");
        System.out.println("Please insert amount:");
        System.out.println("Example: £1 = 100; 50p = 50 ; £1.50 = 150");

       /* System.out.println("Type 0 to skip coin type");
        System.out.println("10p,20p,50p,£1,£2");
        System.out.println(" |   |   |   |  |");
        System.out.println(" V   V   V   V  V");
        System.out.println(" 0,  0,  0,  0, 0");*/
    }



    public static int displayChangeMessage(int[] changeMsg) {
        System.out.println("______________________________________");
        System.out.println("Your change is : ");
        System.out.println("    £2 coins: " + changeMsg[0] );
        System.out.println("    £1 coins: " + changeMsg[1]);
        System.out.println("    50 pence coins: " + changeMsg[2]);
        System.out.println("    20 pence coins: " + changeMsg[3]);
        System.out.println("    10 pence coins: " + changeMsg[4]);
        return 0;
    }

    public static void outOfStockMessage() {
        System.out.println("Out of Stock \n Please choose another product");

    }

    public static void insufficientMessage() {
        System.out.println("Insufficient Amount \n Please insert coins:");

    }

    public static void giveItem() {
        System.out.println("Please collect your product");
    }
}
