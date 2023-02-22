package character;

import java.util.Random;

public class Warrior extends Player {
    private static final Random random = new Random();

    /**
     * Create a new player using given parameters
     *
     * @param name of the player
     * @param type

     */
    public Warrior(String name, String type) {
        super(name, random.nextInt(5,10), random.nextInt(5, 10), type);
    }

}
