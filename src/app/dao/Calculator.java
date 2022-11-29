package app.dao;


import app.model.Coins;

public class Calculator {


    //public static ArrayList<Integer> paidIn = new ArrayList<>();

/*
public static int totalChangePaidIn(String m) {
            int one = Integer.parseInt(m[0]) * Coins.TEN_P.getValue();
            int two = m[1]  * Coins.TWENTY_P.getValue();
            int three = m[2]  * Coins.FIFTY_P.getValue();
            int four = m[3]  * Coins.HUNDRED_P.getValue();
            int five = m[4]  * Coins.TWO_HUNDRED_P.getValue();
            int totalChangePainIn = one + two + three + four + five;

        return totalChangePainIn;

    }*/


    /*   public static int[] calculateChange(int enteredCoins) {

           int remainingAmount = enteredCoins;
           int change200 = remainingAmount/ Coins.TWO_HUNDRED_P.getValue();
           remainingAmount = remainingAmount % Coins.TWO_HUNDRED_P.getValue();

           int change100 = remainingAmount / Coins.HUNDRED_P.getValue();
           remainingAmount = remainingAmount % Coins.HUNDRED_P.getValue();

           int change50 = remainingAmount / Coins.FIFTY_P.getValue();
           remainingAmount= remainingAmount % Coins.FIFTY_P.getValue();

           int change20 = remainingAmount/ Coins.TWENTY_P.getValue();
           remainingAmount = remainingAmount % Coins.TWENTY_P.getValue();

           int change10 = remainingAmount % Coins.TEN_P.getValue();

           int [] changeCoins = {change200,change100,change50,change20,change10};
           return changeCoins;
       }
   */
    public static int[] calculateChange(int enteredCoins) {

        int remainingAmount = enteredCoins;

        int change200 = Math.round(remainingAmount/ Coins.TWO_HUNDRED_P.getValue());
        int remainingAmount200 = remainingAmount % Coins.TWO_HUNDRED_P.getValue();

        int change100 = Math.round(remainingAmount200 / Coins.HUNDRED_P.getValue());
        int remainingAmount100 = remainingAmount200 % Coins.HUNDRED_P.getValue();

        int change50 = Math.round(remainingAmount100 / Coins.FIFTY_P.getValue());
        int remainingAmount50= remainingAmount100 % Coins.FIFTY_P.getValue();

        int change20 = Math.round(remainingAmount50/ Coins.TWENTY_P.getValue());
        int remainingAmount20 = remainingAmount50 % Coins.TWENTY_P.getValue();

        int change10 = remainingAmount20 / Coins.TEN_P.getValue();

        int [] changeCoins = {change200,change100,change50,change20,change10};
        return changeCoins;
    }

   /* public static int changeForMessage(int paidIn, int price){
        int remain = paidIn - price;
        return remain;
    }*/

  /*  public static int totalChangePaidIn(int temp){
        int total = 0;
        total+=   temp[5] *Coins.TWO_HUNDRED_P.getValue();
        total += temp[4] *Coins.HUNDRED_P.getValue();
        total += temp[3] *Coins.FIFTY_P.getValue();
        total += temp[2] *Coins.TWENTY_P.getValue();
        total += temp[1] *Coins.TEN_P.getValue();

        return total;
    }*/

}
