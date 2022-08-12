package Characters;

import Items.Items;
import Items.Weapon;
import Items.ItemDamageType;
import Items.StatusEffect;
import java.util.HashMap;

public class Barbarian extends Martial implements IHeal, IAttack{
    public Barbarian(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances);
    }
    @Override
    public void heal(Character character) {
        if (inventory.removeItemFromInventory(inventory.findItemInInventoryByName("Bandage"))){
            IHeal.super.heal(character);
        }
    }

    public void attack(Character victim, Weapon weapon){
        int bonus = 1;
        IAttack.super.attack(victim, weapon, bonus);
    }
}
