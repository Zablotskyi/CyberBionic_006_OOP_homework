public enum Vehicles {
    Sprinter(6000, "BlackWhite"),
    Peugeot(1500, "Gray"),
    WV(2600, "Gray");

    private final int price;
    private final String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return name() +
                " - price " + price +
                ", color '" + color + '\'';
    }
}
