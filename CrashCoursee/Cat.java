public class Cat {

    public String name;
    public String breed;
    public String gender;
    private boolean isHome;
    private boolean isHungry;
    private boolean isThirsty;
    private int age;
    private double weight;
    private double energyLevel;

    public Cat(String name, String breed, String gender) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;

        isHome = true;
        isHungry = false;
        isThirsty = false;
        age = 1;
        weight = 25.6;

    }

    public void eat(int foodWeight) {
        isHungry = false;
        weight += foodWeight;
        if (weight >= 80) {
            System.out.println(name + " is overweight ");
        }
        else {
            System.out.println(name + " is healthy weight ");
        }
        System.out.println(name + "'s weight started at " + (weight - foodWeight) + " and is now " + weight);

    }

    public void runAway(double miles) {
        weight -= 1;
        energyLevel -= miles;
        System.out.println(name + " is running.");
        if (weight <= 15) {
            System.out.println(name + " is underweight");
        }
        else {
            System.out.println(name + " is healthy weight");
        }
        if (energyLevel < 0) {
            energyLevel = 0;
            System.out.println("You are out of energy.");
        }
        if (isHome == false && isHungry == false) {
            System.out.println(name + "has a new owner");
        }

    }

    public void drink() {
        isThirsty = false;
        System.out.println(name + " is drinking.");
    }

    public void climb () {
        isThirsty = true;
        System.out.println(name + " is climbing.");
    } 

    public void birthday() {
        age += 1;
        System.out.println("It is " + name + " 's birthday!");
    }

}