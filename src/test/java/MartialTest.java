import Characters.Barbarian;
import Characters.Cleric;
import Characters.Inventory;
import Items.ItemDamageType;
import Items.Items;
import Items.MiscItems;
import Items.StatusEffect;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class MartialTest {
    Cleric cleric1;
    Barbarian barbarian1;
    Weapon sword1;
    Weapon pocketsand1;




    @Before
    public void beforeEach(){
        cleric1 = new Cleric("Philip", 20, 10, 10, new Inventory(), new HashMap<>(), StatusEffect.NONE, ItemDamageType.NONE, 20, 20);
        barbarian1 = new Barbarian("Ron", 20, 10, 10, new Inventory(), new HashMap<>(), StatusEffect.NONE, ItemDamageType.NONE);
        sword1 = new Weapon("Swordy mcSwordFace", 10, WeaponType.SWORD, ItemDamageType.SLASHING, StatusEffect.NONE, 5);
        pocketsand1 = new Weapon("Powder of blinding", 1, WeaponType.POCKETSAND, ItemDamageType.NONE, StatusEffect.BLINDING, 0);

    }

    @Test
    public void barbarianCanHealIfHaveABandage(){
        Items bandage = new MiscItems("Bandage", 1);
        barbarian1.addItemToInventory(bandage);
        barbarian1.heal(cleric1);
        assertEquals(15, cleric1.getHP());
    }

    @Test
    public void barbarianCannotHealIfHaveNoABandage(){
        barbarian1.heal(cleric1);
        assertEquals(10, cleric1.getHP());
    }
    @Test
    public void barbarianCanAttackWIthSword(){
        barbarian1.attack(cleric1, sword1);
        assertEquals(4, cleric1.getHP());
    }
    @Test
    public void barbarianCanAttackWithPocketSand(){
        barbarian1.attack(cleric1, pocketsand1);
        assertEquals(StatusEffect.BLINDING, cleric1.getStatusEffect());
    }
}
