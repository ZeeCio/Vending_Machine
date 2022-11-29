package app.controller;
import app.view.UIview;
import static app.dto.DataEngine.*;


public class Controller extends Order {


    public static UIview ui = new UIview();
    // public static ArrayList<Integer> paidIn = new ArrayList<>();

    public static void main(String[] args) {

        while (ui.isON) {
            readData();
            menu();
        }
        writeOnFile();

    }



}
