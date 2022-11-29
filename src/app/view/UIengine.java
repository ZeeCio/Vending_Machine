package app.view;
import java.util.Scanner;


public class UIengine extends UIview {


    public static int readProductRange (String input,int min, int max){
        int a;

        do {
            System.out.println(input);

            Scanner scan = new Scanner(System.in);
            a = Integer.parseInt(scan.nextLine());

            if (a > max || a < min) {
                System.out.println("Your entry was not within the specified bounds.");
            }

        } while (a > max || a < min);

        return a;
    }


 /*public static int convertAmountToInt(double userInput) {
        // String[] numberCoinsInText = userInput.split(",");
     int value = ((int)userInput);

     return value;
    }
*/

    /*public static ItemsClass searchItem(int number) {
        for (ItemsClass product : DataEngine.itemsRecord) {
            if (product.getItemNumber() == number) {
                return product;
            }
        }
        return null;
    }*/

}
