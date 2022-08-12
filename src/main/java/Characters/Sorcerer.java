package Characters;

import Items.Items;
import Items.ItemDamageType;
import Items.StatusEffect;

import java.util.ArrayList;
import java.util.HashMap;

public class Sorcerer extends Caster{
    public Sorcerer(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances, int maxMP, int MP) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances, maxMP, MP);
    }
}
