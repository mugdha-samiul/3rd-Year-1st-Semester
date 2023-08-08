package main;

public class Main {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder()
                .withBun("Sesame Seed Bun")
                .withPatty("Beef Patty")
                .withCheese("Cheddar")
                .withLettuce("Iceberg Lettuce")
                .withSauce("Ketchup and Mustard")
                .build();

        System.out.println(burger);
    }
}