import java.util.Scanner;

public class Pet {

    // Private Variables
    private String _name;
    private int _hunger;
    private int _cleanliness;
    private int _happiness;
    private int _health;
    private int _age;

    //Constructor
    public Pet() {
        System.out.println("-Virtual Koala");
        System.out.println("/'--.._ `'-=\"\"\"=-'` _..--'\\\n" +
                "|   ~. )  _     _  ( .~   |\n" +
                " \\  '~/   a  _  a   \\~'  /\n" +
                "  \\  `|     / \\     |`  /\n" +
                "   `'--\\    \\_/    /--'`\n" +
                "       .'._  J__.-'.\n" +
                "      / /  '-/_ `-  \\\n" +
                "     / -\"-'-.  '-.__/\n" +
                "     \\__,-.\\/     | `\\\n" +
                "     /  ;---.  .--'   |\n" +
                "    |     /\\'-'      /\n" +
                "jgs '.___.\\   _.--;'`)");
        System.out.println("Please Enter a name for your pet");
        Scanner input = new Scanner(System.in);
        _name = input.nextLine();
        System.out.println("Initalizing Stats");

        //Randomize Initial Stats
        _hunger = (int)(Math.random() * 10 + 1);
        _cleanliness = (int)(Math.random() * 10 + 1);
        _happiness = (int)(Math.random() * 10 + 1);
        _health = (int)(Math.random() * 10 + 1);
        _age = 0;
    }
    public String getName(){
        return _name;
    }

    public int get_age() {
        return _age;
    }
    public int getHealth(){
        return _health;
    }
    public int getHunger() {
        return _hunger;
    }
    public int getHappiness() {
    return _happiness;
    }
    public int get_cleanliness(){
        return _cleanliness;
    }
    public void increaseHunger(){
        _hunger++;
    }
    public void increaseCleanliness(){
        _cleanliness++;
    }
    public void increaseHealth(){
        _health++;
    }
    public void increaseHappiness(){
        _happiness++;
    }
    public void increaseAge(){
        _age++;
    }
    public void decreaseHunger(){
        _hunger--;
    }
    public void decreaseCleanliness(){
        _cleanliness--;
    }
    public void decreaseHealth(){
        _health--;
    }
    public void decreaseHappiness(){ _happiness--;}

}
