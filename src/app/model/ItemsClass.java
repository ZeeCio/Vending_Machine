package app.model;

import java.util.ArrayList;

public class ItemsClass implements ItemsInterface {
    public ArrayList<ItemsClass> items = new ArrayList<>();
    private int itemNumber;
    private String itemName;
    private int itemPrice;
    private int itemStock;



    public ItemsClass( int itemNumber,String itemName, int itemPrice, int itemStock) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemStock = itemStock;
        items.add(this);
    }


    public ItemsClass() {

    }

    @Override
    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public int getItemPrice() {
        return itemPrice;
    }

    @Override
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public int getItemStock() {
        return itemStock;
    }

    @Override
    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }
}
