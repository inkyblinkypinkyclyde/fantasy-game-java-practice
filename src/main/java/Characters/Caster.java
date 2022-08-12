package Characters;

import Items.Items;
import Items.ItemDamageType;
import Items.StatusEffect;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Caster extends Character{
    int maxMP;
    int MP;

    public Caster(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances, int maxMP, int MP) {
        super(name, maxHP, HP, AC, inventory, equipped, statusEffect, naturalResistances);
        this.maxMP = maxMP;
        this.MP = MP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
}
