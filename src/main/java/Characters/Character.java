package Characters;

import Items.Items;
import Items.ItemDamageType;
import Items.StatusEffect;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Character{
    String name;
    int maxHP;
    int HP;
    int AC;
    Inventory inventory;
    HashMap<BodyPart, Items> equipped;
    StatusEffect statusEffect;
    ItemDamageType naturalResistances;

    public Character(String name, int maxHP, int HP, int AC, Inventory inventory, HashMap<BodyPart, Items> equipped, StatusEffect statusEffect, ItemDamageType naturalResistances) {
        this.name = name;
        this.maxHP = maxHP;
        this.HP = HP;
        this.AC = AC;
        this.inventory = inventory;
        this.equipped = equipped;
        this.statusEffect = statusEffect;
        this.naturalResistances = naturalResistances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public ArrayList<Items> getInventory() {
        return inventory.getInventory();
    }


    public HashMap<BodyPart, Items> getEquipped() {
        return equipped;
    }


    public StatusEffect getStatusEffect() {
        return statusEffect;
    }

    public void setStatusEffect(StatusEffect statusEffect) {
        this.statusEffect = statusEffect;
    }

    public ItemDamageType getNaturalResistances() {
        return naturalResistances;
    }


    public void addItemToInventory(Items item) {
        inventory.inventory.add(item);
    }

    public boolean removeItemFromInventory(Items itemToRemove) {
        return inventory.inventory.remove(itemToRemove);
    }

    public void equipItem(BodyPart bodyPart, Items item){
        if (removeItemFromInventory(item)){
            if (getEquipped().get(bodyPart) == null){
                equipped.put(bodyPart, item);
            }
        }
    }

}
