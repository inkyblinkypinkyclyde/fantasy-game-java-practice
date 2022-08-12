package Characters;

import Items.Items;
import Items.StatusEffect;
import Items.ItemDamageType;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Martial extends Character{
    public Martial(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances);
    }
}
