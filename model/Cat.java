package model;

import enums.FurColor;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String Food;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name,
               int age,
               double weight,
               FurColor furColor,
               boolean isIndoor,
               String Food,
               int purringFrequency,
               boolean isNeutered) {

        super(name, age, weight);

        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.Food = Food;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    @Override
    public void makeSound() {
        System.out.println(
                getName() + " says: Miau (" +
                purringFrequency + " Hz)");
    }

    @Override
    public void sleep() {
        System.out.println(
                getName() +
                " sleeps about 14 hours in the warmest place available."
        );
    }

    public void move(int distance, int speed) {
        System.out.println(
                getName() +
                " jumps " + distance +
                " meters at " + speed +
                " km/h."
        );
    }

    public void move(int distance, String target) {
        System.out.println(
                getName() +
                " silently approaches " +
                target +
                " for " + distance +
                " meters."
        );
    }

    public void purr() {
        System.out.println(
                getName() +
                " is purring at " +
                purringFrequency +
                " Hz."
        );
    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(
                    getName() +
                    " lost a life. Remaining lives: " +
                    lives
            );
        } else {
            System.out.println(
                    getName() +
                    " has no lives remaining."
            );
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Lives: " + lives);
        System.out.println("Fur Color: " + furColor.getDisplayName());
        System.out.println("Indoor Cat: " + isIndoor);
        System.out.println("Food: " + Food);
        System.out.println("Purring Frequency: " + purringFrequency + " Hz");
        System.out.println("Neutered: " + isNeutered);
    }

    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}