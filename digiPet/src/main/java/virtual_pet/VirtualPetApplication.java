package virtual_pet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(
                (ANSI.GREEN + "CONGRATULATIONS! YOU ARE NEW OWNER OF AMAZING BEST PET. PLEASE NAME AMAZING BEST PET: "
                        + ANSI.RESET));
        String name = input.nextLine();
        int random;
        VirtualPet pet = new VirtualPet(name);
        int menu;
        int mystery = 0;

        do {
            System.out.println("Press the corresponding key to make a choice from this list.");
            System.out.println("1. Check " + name + "'s status.");
            System.out.println("2. Feed " + name + ".");
            System.out.println("3. Give " + name + " a bev.");
            System.out.println("4. Play with " + name + ".");
            System.out.println("5. Let " + name + " take a nap.");
            System.out.println("0. Quit.");

            random = ThreadLocalRandom.current().nextInt(1, 5);
            menu = input.nextInt();
            input.nextLine();
            mystery++;

            if (menu == 0) {
                continue;
            } else if (menu == 1) {
                pet.getStatus(random);
            }

            else if (menu == 2) {
                pet.feed(random);
            }

            else if (menu == 3) {
                pet.sip(random);
            }

            else if (menu == 4) {
                pet.play(random);
            }

            else if (menu == 5) {
                pet.honkShoo(random);
            }

            else {
                System.out.println(ANSI.RED + "You've made an invalid selection. Never do that again." + ANSI.RESET);
            }

        } while (menu != 0);
        input.close();
    }

}
