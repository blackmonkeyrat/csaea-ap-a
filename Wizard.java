public class Wizard {
    
    String characterName;
    int health;
    int powerLevel;
    int energyLevel;
    String abilityName;
    boolean isHungry;
    String clan;

    public Wizard(String characterName, String abilityName, String clan) {
        this.characterName = characterName;
        this.abilityName = abilityName;
        this.clan = clan;

        health = 80;
        powerLevel = 150;
        isHungry = false;
        energyLevel = 77;

    }

    public void attackCharacter() {
        energyLevel -= 10;
        if (energyLevel < 0) {
            energyLevel = 0
        }
        powerLevel += 15;
        if (powerLevel > 500) {
            powerLevel = 500;
        }
    }

    public void getsAttacked() {
        health -= 15;
    }

    public void eatsFood() {
        isHungry = false;
    }

    public void teleport() {
        energyLevel -= 20;
        if (energyLevel < 0) {
            energyLevel = 0;
        }
    }
}
