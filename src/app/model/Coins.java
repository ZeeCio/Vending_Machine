package app.model;


public enum Coins {
    TEN_P(10), TWENTY_P(20), FIFTY_P(50), HUNDRED_P(100), TWO_HUNDRED_P(200);

    private int value;


    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}