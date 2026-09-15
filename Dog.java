public class Dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 80;
        age = 7;
        isHungry = false;
        isHome = true;
        weight = 42.6;

    }

    public void eat() {
        isHungry = false;
        weight += 0.5;
    }

    public void runAway() {
        isHome = false;
        energyLevel -= 5;
    }

    public void comeHome() {
        isHome = true;
    }

    public void sleep() {
        energyLevel += 50;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }

    public void haveBirthday() {
        age += 1;
    }

}
