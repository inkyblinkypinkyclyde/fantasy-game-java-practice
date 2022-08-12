package Characters;

import Items.Items;
import Items.ItemDamageType;
import Items.StatusEffect;

import java.util.ArrayList;
import java.util.HashMap;

public class Cleric extends Caster implements IHeal{
    public Cleric(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances, int maxMP, int MP) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances, maxMP, MP);
    }
    @Override
    public void heal(Character character){
        if (this.MP >= 5){
            setMP(this.MP-5);
            IHeal.super.heal(character);
        }
    }

}
