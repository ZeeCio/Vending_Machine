package app.dto;
import app.model.ItemsClass;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DataEngine {

    public  static ArrayList<ItemsClass> itemsRecord = new ArrayList<>();

    public static String FILE = "src/app/model/Inventory.txt";

    public static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

    public static void readData () {
        System.out.println("Getting data from: " + FILE);
        // File txt = new File(FILE); // The File class of the java.io package - The file object is linked with the specified file path
        FileReader fr;

        try {
            fr = new FileReader(FILE);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) { // while different from null/ while there are lines with data in file

                String[] eachLine = line.split(","); // split method marshall data/ splits the coma out
                line = br.readLine();
                int number = Integer.parseInt(eachLine[0]); // assigning the value from the data on position []
                String item = eachLine[1];
                int price = Integer.parseInt(eachLine[2]);
                int stock = Integer.parseInt(eachLine[3]);
                ItemsClass newRecord = new ItemsClass(number, item, price, stock); // assigning the values to dvd obj
                itemsRecord.add(newRecord);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves object to the file
     */
    public static void writeOnFile () {
        System.out.println("Saving changes...");
        try {
            FileWriter writer = new FileWriter(FILE);

            for (ItemsClass item : itemsRecord) {
                // new string holding the values
                String inputItem = item.getItemNumber() + "," + item.getItemName() + "," + // Data unmarshaling
                        item.getItemPrice() + "," + item.getItemStock() + "Purchased on: "+ timeStamp;
                writer.write(inputItem); // write the new dvd info
                writer.write("\n"); // new row

            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved successfully");
    }

    public static void keepRecordOnFile () {
        System.out.println("________________");
        System.out.println("Saving records...");
        File f = new File("src/app/model/RecordInventory.txt");
        // Date date = new Date();
        // Timestamp timestamp = new Timestamp(date.getTime());
        try {

            FileWriter writer = new FileWriter(f);

            for (ItemsClass item : itemsRecord) {
                // new string holding the values
                String inputItem = item.getItemNumber() + "," + item.getItemName() + "," + // Data unmarshaling
                        item.getItemPrice() + "," + item.getItemStock();
                writer.write(inputItem); // write the new dvd info
                writer.write("\n"); // new row

            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved successfully");
    }
}
