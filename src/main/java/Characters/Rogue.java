package Characters;

import Items.Items;
import Items.ItemDamageType;
import Items.StatusEffect;

import java.util.ArrayList;
import java.util.HashMap;

public class Rogue extends Martial{
    public Rogue(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances);
    }
}
