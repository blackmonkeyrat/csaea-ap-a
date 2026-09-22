public class Knight {
    
    // 1. Data / Attributes
    String characterName;
    int health; // 0-100
    int energyLevel; // 0-100
    boolean isHoly;
    int strength; //at least 1
    boolean hasWeapon;
    int speed;
    

    // 2. Constructor
    // Special method, only runs when we create a Knight object

    public Knight(String characterName, int health, boolean isHoly) {
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;

        energyLevel = 87;
        strength = 10;
        hasWeapon = true;
        speed = 50;
    }

    // 3. Behaviors

    public void eat() {
        energyLevel += 25;
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }
    
    public void breakWeapon() {
        hasWeapon = false;
        health /= 2;
    }

    public void workout () {
        strength += 1;
        energyLevel -= 10;
    }

    public void takeDamage (int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println("You died.");
        }
    }
}
