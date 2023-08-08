package main;

public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String lettuce;
    private String sauce;

    public Burger(String bun, String patty, String cheese, String lettuce, String sauce) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Burger: " +
                "Bun = " + bun +
                ", Patty = " + patty +
                ", Cheese = " + cheese +
                ", Lettuce = " + lettuce +
                ", Sauce = " + sauce;
    }
}
