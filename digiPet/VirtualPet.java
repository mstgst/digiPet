package virtual_pet;

public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int sleepy;
    private int bored;

    public VirtualPet(String petName) {
        name = petName;
        hunger = 1;
        thirst = 1;
        sleepy = 1;
        bored = 1;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getSleepy() {
        return this.sleepy;
    }

    public void setSleepy(int sleepy) {
        this.sleepy = sleepy;
    }

    public int getBored() {
        return this.bored;
    }

    public void setBored(int bored) {
        this.bored = bored;
    }

    public void modHunger(int hungerMod) {
    hunger += hungerMod;
    }

    public void modThirst(int thirstMod) {
    thirst += thirstMod;
    }

    public void modSleepy(int sleepyMod) {
    sleepy += sleepyMod;
    }

    public void modBored(int boredMod) {
    bored += boredMod;
    }

    public void tick() {
    hunger += 1;
    thirst += 1;
    sleepy += 1;
    bored += 1;
    }


}
