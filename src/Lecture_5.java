/*
    Ean McGilvery
    Lab 05
    The purpose of this poroject is to learn how to create classes with setters/getters and constructors
 */

import java.util.Scanner;

public class Lecture_5 {

    public static class Lab_05 {
        public static void main(String[] args) {
            // Initialize Pet
            Scanner input = new Scanner(System.in);
            int menuOption = 0;
            boolean quit = false;
            Pet kolly = new Pet();

            //Print out The Koala Stats
            printStats(kolly);
            System.out.println(kolly.getName() + " was born!");

            //Game Loop
            do{
                //Output menu and get selection
                mainMenu();
                menuOption = input.nextInt();

                //Choose between two randomized statements in each menu option
                if (menuOption == 1) {
                    kolly.increaseHunger();
                    int oneOrTwo = (int)(Math.random() * 2 + 1);
                    if(oneOrTwo == 1){
                        System.out.println("+1" + kolly.getName() + " swallows some Aloe Vera!");
                    }
                    if(oneOrTwo == 2){
                        System.out.println("+1" + kolly.getName() +" eats some good food.");
                    }
                } else if (menuOption == 2) {
                    kolly.increaseCleanliness();
                    int oneOrTwo = (int)(Math.random() * 2 + 1);
                    if(oneOrTwo == 1){
                        System.out.println("+1 " + kolly.getName() + " takes a bath in the stream!");
                    }
                    if(oneOrTwo == 2){
                        System.out.println("+1 " + kolly.getName() +" wanders into a shower.");
                    }
                } else if (menuOption == 3) {
                    kolly.increaseHappiness();
                    int oneOrTwo = (int)(Math.random() * 2 + 1);
                    if(oneOrTwo == 1){
                        System.out.println("+1 " + kolly.getName() + " giggles as you tickle him!");
                    }
                    if(oneOrTwo == 2){
                        System.out.println("+1 " + kolly.getName() +" runs as you chase after him!");
                    }
                } else if (menuOption == 4) {
                    kolly.increaseHealth();
                    int oneOrTwo = (int)(Math.random() * 2 + 1);
                    if(oneOrTwo == 1){
                        System.out.println("+1 " + kolly.getName() + " feels the warmth of you love");
                    }
                    if(oneOrTwo == 2){
                        System.out.println("+1 " + kolly.getName() +" goes to the hospital for a check up");
                    }
                } else if (menuOption == 5) {
                    quit = true;
                }
                //Increase age and print stats
                kolly.increaseAge();
                printStats(kolly);
                //Check to see death
                if (kolly.get_age() == 10) {
                    System.out.println(kolly.getName() + " died of old age");
                    quit = true;
                }

            }while(!quit);
            System.out.println("Quitting Program");
        }

        //Create function to show the current stats
        private static void printStats(Pet kolly) {
            System.out.println(kolly.getName() + "'s Stats-");
            System.out.println("Hunger: " + kolly.getHunger());
            System.out.println("Cleanliness: " + kolly.get_cleanliness());
            System.out.println("Happiness " + kolly.getHappiness());
            System.out.println("Health: " + kolly.getHealth());
        }
        //Funct to display menu
        private static void mainMenu(){
            System.out.println("Main Menu:\n");
            System.out.println("1. Feed\n");
            System.out.println("2. Wash\n");
            System.out.println("3. Play\n");
            System.out.println("4. Health\n");
            System.out.println("5. Quit\n");
            System.out.println("Enter a number(1-5)\n");
        }
    }
}