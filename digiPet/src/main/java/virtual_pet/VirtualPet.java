package virtual_pet;

import java.util.ArrayList;

public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int sleepy;
    private int bored;

    public VirtualPet(String petName) {
        name = petName;
        hunger = 15;
        thirst = 15;
        sleepy = 15;
        bored = 15;
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
        this.hunger += hungerMod;
    }

    public void modThirst(int thirstMod) {
        this.thirst += thirstMod;
    }

    public void modSleepy(int sleepyMod) {
        this.sleepy += sleepyMod;
    }

    public void modBored(int boredMod) {
        this.bored += boredMod;
    }

    public void getStatus(int random) {
        System.out.println(name + "'s status: ");
        this.plainStats();
        this.tick(random);
    }

    public void honkShoo(int random) {
        if (this.getSleepy() < 50) {
            System.out.println(ANSI.RED + name + " doesn't want to take a nap right now!" + ANSI.RESET);
            this.tick(random);
            this.plainStats();
        } else {
            System.out.println(ANSI.GREEN + "Sleep tight, " + name + "! zzzz" + ANSI.RESET);
            this.modHunger(+5);
            this.modThirst(+5);
            this.modBored(+6);
            this.modSleepy(-55);
            this.tick(random);
            System.out.println(ANSI.RED + "Hunger: " + String.valueOf(this.getHunger()) + ANSI.RESET);
            System.out.println(ANSI.RED + "Thirst: " + String.valueOf(this.getThirst()) + ANSI.RESET);
            System.out.println(ANSI.RED + "Boredom: " + String.valueOf(this.getBored()) + ANSI.RESET);
            System.out.println(ANSI.GREEN + "Sleepiness: " + String.valueOf(this.getSleepy()) + ANSI.RESET);
        }
    }

    public void feed(int random) {
        if (this.getHunger() < 15) {
            System.out.println(ANSI.RED + name + " isn't hungry enough for that!" + ANSI.RESET);
            this.tick(random);
            this.plainStats();
        } else {
            System.out.println(ANSI.GREEN + name + " eats the food with reckless abandon. It's kind of scary." + ANSI.RESET);
            this.modHunger(-50);
            this.modThirst(+3);
            this.modSleepy(+3);
            this.tick(random);
            System.out.println(name + "'s status:");
            System.out.println(ANSI.GREEN + "Hunger: " + String.valueOf(this.getHunger()) + ANSI.RESET);
            System.out.println(ANSI.RED + "Thirst: " + String.valueOf(this.getThirst()) + ANSI.RESET);
            System.out.println("Boredom: " + String.valueOf(this.getBored()));
            System.out.println(ANSI.RED + "Sleepiness: " + String.valueOf(this.getSleepy()) + ANSI.RESET);
        }
    }

    public void sip(int random) {
        if (this.getThirst() < 15) {
            System.out.println(ANSI.RED + name + " isn't thirsty enough for that!" + ANSI.RESET);
            this.tick(random);
            this.plainStats();
        } else {
            System.out.println(ANSI.GREEN + name + " slurps the bev up hastily. Yeah!" + ANSI.RESET);
            this.modThirst(-50);
            this.tick(random);
            System.out.println("Hunger: " + String.valueOf(this.getHunger()));
            System.out.println(ANSI.GREEN + "Thirst: " + String.valueOf(this.getThirst()) + ANSI.RESET);
            System.out.println("Boredom: " + String.valueOf(this.getBored()));
            System.out.println("Sleepiness: " + String.valueOf(this.getSleepy()));
        }
    }

    public void play(int random) {
        if (this.getBored() < 30) {
            System.out.println(ANSI.RED + name + " doesn't want to play right now." + ANSI.RESET);
            this.tick(random);
            this.plainStats();
        } else {
            System.out.println(
                    ANSI.GREEN + "You play with " + name + ". It's having fun but it seems more tired." + ANSI.RESET);
            this.modHunger(+4);
            this.modThirst(+4);
            this.modBored(-50);
            this.modSleepy(+8);
            this.tick(random);
            System.out.println(ANSI.RED + "Hunger: " + String.valueOf(this.getHunger()) + ANSI.RESET);
            System.out.println(ANSI.RED + "Thirst: " + String.valueOf(this.getThirst()) + ANSI.RESET);
            System.out.println(ANSI.GREEN + "Boredom: " + String.valueOf(this.getBored()) + ANSI.RESET);
            System.out.println(ANSI.RED + "Sleepiness: " + String.valueOf(this.getSleepy()) + ANSI.RESET);
        }
    }

    public void plainStats() {
        System.out.println("Hunger: " + String.valueOf(this.getHunger()));
        System.out.println("Thirst: " + String.valueOf(this.getThirst()));
        System.out.println("Boredom: " + String.valueOf(this.getBored()));
        System.out.println("Sleepiness: " + String.valueOf(this.getSleepy()));
    }

    public ArrayList<Integer> getAllNeeds() {
        ArrayList<Integer> needs = new ArrayList<>();
        needs.add(this.hunger);
        needs.add(this.thirst);
        needs.add(this.sleepy);
        needs.add(this.bored);
        return needs;
    }

    public void tick(int random) {
        this.hunger += random;
        this.thirst += random;
        this.sleepy += random;
        this.bored += random;
        if (this.hunger < 0) {
            this.hunger = 0;
        }
        if (this.hunger > 100) {
            this.hunger = 100;
        }
        if (this.thirst < 0) {
            this.thirst = 0;
        }
        if (this.thirst > 100) {
            this.thirst = 100;
        }
        if (this.sleepy < 0) {
            this.sleepy = 0;
        }
        if (this.sleepy > 100) {
            this.sleepy = 100;
        }
        if (this.bored < 0) {
            this.bored = 0;
        }
        if (this.bored > 100) {
            this.bored = 100;
        }
    }

}
