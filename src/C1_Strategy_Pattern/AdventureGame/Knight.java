package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.Axe;

public class Knight extends Character {
    public Knight() {
        weapon = new Axe();
    }

    public void fight() {
        System.out.println("A Knight fights with Axe");
    }
}

