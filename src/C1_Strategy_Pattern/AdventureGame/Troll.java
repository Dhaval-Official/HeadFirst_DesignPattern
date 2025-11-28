package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.Knife;

public class Troll extends Character{
    public Troll() {
        weapon = new Knife();
    }

    public void fight() {
        System.out.println("A Troll fights with Knife");
    }
}
