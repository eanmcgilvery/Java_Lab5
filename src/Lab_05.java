public class Lab_05 {
    public static void main() {
        // Initialize Pet
        Pet kolly = new Pet();

        //Print out The Koala Stats
        System.out.println("-George's Stats-");
        printStats(kolly);
    }
     public static void printStats(Pet kolly){
        System.out.println("Hunger: " + kolly.getHunger());
        System.out.println("Cleanliness: " + kolly.get_cleanliness());
        System.out.println("Happiness " + kolly.getHappiness());
        System.out.println("Health: " + kolly.getHealth());
    }
}
