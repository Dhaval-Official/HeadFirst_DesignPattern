package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.Axe;
import C1_Strategy_Pattern.AdventureGame.Weapons.BowAndArrow;
import C1_Strategy_Pattern.AdventureGame.Weapons.Knife;

public class AdventureGameSimulator {

    public static void main(String[] args) {

        Character Dhaval = new King();
        Dhaval.setWeapon(new Knife());
        Dhaval.weapon.useWeapon();
        Dhaval.fight();

        System.out.println();

        Character k = new Knight();
        k.setWeapon(new Axe());
        k.fight();

        System.out.println();

    }

}
