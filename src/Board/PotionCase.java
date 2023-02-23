package Board;

import character.Player;

import java.awt.*;

public abstract class PotionCase extends Case {
    private int lifePoints;

    public PotionCase(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    @Override
    public void start(Player player) {
        System.out.println("Let's get back on track");
        int lifeValue = player.getLife() + lifePoints;
        player.setLife(lifeValue);
        System.out.println("Great potion");
        System.out.println("you found potion ");
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void getLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}