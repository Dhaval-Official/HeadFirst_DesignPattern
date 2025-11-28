package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.BowAndArrow;

public class Queen extends Character{
    public Queen() {
        weapon = new BowAndArrow();
    }

    public void fight() {
        System.out.println("A Queen fights with Bow And Arrow");
    }
}
