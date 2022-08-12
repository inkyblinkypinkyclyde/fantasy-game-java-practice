package Characters;

import Items.Weapon;

public interface IAttack {
    default void attack(Character victim, Weapon weapon, int bonus){
        victim.setHP(victim.getHP()-weapon.getDamageAmount()-bonus);
        victim.setStatusEffect(weapon.getStatusEffect());
    }
}
