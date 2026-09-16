public class Monkey {

    private double weight;
    private boolean isHungry;
    private boolean isThirsty;
    private String name;
    private int age;
    private String breed;
    private String gender;

    public Monkey(String name, String breed, String gender) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;

        weight = 40.0;
        isHungry = false;
        isThirsty = false;
        age = 5;

    }

    public void eat(int foodWeight) {
        isHungry = false;
        weight += foodWeight;
        System.out.println(name + "is eating.");
        if (weight >= 80) {
            System.out.println(name + "is overweight.");
        }
        else {
            System.out.println(name + "is healthy weight.");
        }
    }
    
    public void run() {
        weight -= 1;
        System.out.println(name + "is running.");
        if (weight <= 15) {
            System.out.println(name + "is underweight");
        }
        else {
            System.out.println(name + "is healthy weight");
        }
    }

    public void drink() {
        isThirsty = false;
        System.out.println(name + "is drinking.");
    }

    public void climb () {
        isThirsty = true;
        System.out.println(name + "is climbing.");
    } 

    public void birthday() {
        age += 1;
        System.out.println("It is" + name + "'s birthday!");
    }
}
