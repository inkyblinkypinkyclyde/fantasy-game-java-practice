package Items;

public class Armour extends Items {
    ArmourType ArmourType;
    int addedAC;
    ItemDamageType itemDamageTypeResistance;

    public Armour(String name, int weight, ArmourType armourType, int addedAC, ItemDamageType itemDamageTypeResistance) {
        super(name, weight);
        ArmourType = armourType;
        this.addedAC = addedAC;
        this.itemDamageTypeResistance = itemDamageTypeResistance;
    }

    public ArmourType getArmourType() {
        return ArmourType;
    }

    public int getAddedAC() {
        return addedAC;
    }

    public ItemDamageType getDamageTypeResistance() {
        return itemDamageTypeResistance;
    }
}
