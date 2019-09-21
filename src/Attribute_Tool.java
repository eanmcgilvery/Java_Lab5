public class Attribute_Tool {

    public void checkCleanliness(Pet myPet) {
        if (myPet.get_cleanliness() < 5) {
            //Get two random Numbers
            int randNum = (int) (Math.random() * 3 + 1);
            int flavorText = (int) (Math.random() * 2 + 1);

            //
            if (randNum == 1) {
                myPet.decreaseHappiness();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + "\'s bike was stolen.");
                else
                    System.out.println("-1 " + myPet.getName() + "\'s lollipop shattered");
            }
            if (randNum == 2) {
                myPet.decreaseHealth();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " lost a limb");
                else
                    System.out.println("-1 " + myPet.getName() + " forgot to go to the gym... for a year");
            }
            if (randNum == 3) {
                myPet.decreaseHunger();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " ran a marathon");
                else
                    System.out.println("-1 " + myPet.getName() + " Got ill and threw up!");
            }

        }

    }

    public static void checkHappiness(Pet myPet){
        if (myPet.get_cleanliness() < 5) {
            //Get two random Numbers
            int randNum = (int) (Math.random() * 3 + 1);
            int flavorText = (int) (Math.random() * 2 + 1);

            //
            if (randNum == 1) {
                myPet.decreaseCleanliness();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " rolled in the mud.");
                else
                    System.out.println("-1 " + myPet.getName() + " became lazy and didn't shower for two weeks!");
            }
            if (randNum == 2) {
                myPet.decreaseHealth();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " lost a limb");
                else
                    System.out.println("-1 " + myPet.getName() + " forgot to go to the gym... for a year");
            }
            if (randNum == 3) {
                myPet.decreaseHunger();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " ran a marathon");
                else
                    System.out.println("-1 " + myPet.getName() + " Got ill and threw up!");
            }
        }
    }

    public static void checkHealth(Pet myPet){
        if (myPet.getHealth() < 5) {
            //Get two random Numbers
            int randNum = (int) (Math.random() * 3 + 1);
            int flavorText = (int) (Math.random() * 2 + 1);

            //
            if (randNum == 1) {
                myPet.decreaseHappiness();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + "\'s bike was stolen.");
                else
                    System.out.println("-1 " + myPet.getName() + "\'s lollipop shattered");
            }
            if (randNum == 2) {
                myPet.decreaseCleanliness();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " rolled in the mud.");
                else
                    System.out.println("-1 " + myPet.getName() + " became lazy and didn't shower for two weeks!");
            }
            if (randNum == 3) {
                myPet.decreaseHunger();
                if(flavorText == 1)
                    System.out.println("-1 " + myPet.getName() + " ran a marathon");
                else
                    System.out.println("-1 " + myPet.getName() + " Got ill and threw up!");
            }
        }
    }
}
