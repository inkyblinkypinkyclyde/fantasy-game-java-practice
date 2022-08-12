package Items;

public class Weapon extends Items{
    WeaponType weaponType;
    ItemDamageType itemDamageType;
    StatusEffect statusEffect;
    int damageAmount;



    public Weapon(String name, int weight, WeaponType weaponType, ItemDamageType itemDamageType, StatusEffect statusEffect, int damageAmount) {
        super(name, weight);
        this.weaponType = weaponType;
        this.itemDamageType = itemDamageType;
        this.statusEffect = statusEffect;
        this.damageAmount = damageAmount;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ItemDamageType getDamageType() {
        return itemDamageType;
    }

    public StatusEffect getStatusEffect() {
        return statusEffect;
    }

    public int getDamageAmount() {
        return damageAmount;
    }
}
