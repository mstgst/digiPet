package virtual_pet;

import java.util.Scanner;
import java.util.Random;

public class VirtualPetApplication {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("CONGRATULATIONS! YOU ARE NEW OWNER OF AMAZING BEST PET. PLEASE NAME AMAZING BEST PET: ");
        String name = input.nextLine();

        VirtualPet pet = new VirtualPet(name);  
        Random random = new Random;
        int menu;
    do {
        System.out.println("Press the corresponding key to make a choice from this list.");
        System.out.println("1. Check " + name + "'s status.");
        System.out.println("2. Feed " + name + ".");
        System.out.println("3. Give " + name + " a bev.");
        System.out.println("4. Play with " + name + ".");
        System.out.println("5. Let " + name + " take a nap.");
        System.out.println("0. Quit.");

        menu = input.nextInt();

        if (menu == 0) {
            continue;
        }
        else if (menu == 1) {
            System.out.println(name + "'s status:");
            System.out.println("Hunger: " + String.valueOf(pet.getHunger));
            System.out.println("Thirst: " + String.valueOf(pet.getThirst));
            System.out.println("Boredom: " + String.valueOf(pet.getBored));
            System.out.println("Sleepiness: " + String.valueOf(pet.getSleepy));   
            continue;
        }

        else if (menu == 2) {
            if (pet.getHunger < 4) {
                System.out.println(name + " isn't hungry enough!");
                continue;
            }
            System.out.println(name + " eats the food with reckless abandon.")
            pet.modHunger(-1);
            pet.modThirst(+1);
            pet.modSleepy(+1);
        }

        else if (menu == 3) {
            if (pet.getThirst < 3) {
                System.out.println(name + " isn't thirsty enough!");
                continue;
            }
            System.out.println(name + " slurps the bev up hastily.")
            pet.modThirst(-1);
        }

        else if (menu == 4) {
            if (pet.getBored) < 3) {
                System.out.println(name + "doesn't want to play right now.")
                continue;
            }
            System.out.println("You play with " + name + ". It's having fun but it seems more tired.");
            pet.modHunger(+1);
            pet.modThirst(+1)
            pet.modBored(-3);
            pet.modSleepy(+2);
            
        }

        else if (menu == 5) {
            if (pet.getSleepy < 5) {
                System.out.println(name + " doesn't want to take a nap right now!");
                continue;
            }
            System.out.println("Sleep tight, " + name + "!");
            pet.modHunger(+1);
            pet.modThirst(+1)
            pet.modBored(+2);
            pet.modSleepy(-5);
        }

        else {
            System.out.println("You've made an invalid selection. Never do that again.")
        }

        
        pet.tick(); }
        while (select != 0);

    }

}
