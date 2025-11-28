package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.Sword;

public class King extends Character{

    public King() {
        weapon = new Sword();
    }

    public void fight() {
        System.out.println("A King fights with a Sword");
    }

}

