package C1_Strategy_Pattern.AdventureGame;

import C1_Strategy_Pattern.AdventureGame.Weapons.WeaponBehaviour;

public abstract class Character {

    WeaponBehaviour weapon;

    public abstract void fight();

    //Here goes unknown method
    public void setWeapon(WeaponBehaviour w) {
        weapon = w;
    }
}
