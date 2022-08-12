import Items.ItemDamageType;
import Items.StatusEffect;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    Weapon sword1;
    Weapon dagger1;
    Weapon pocketsand1;

    @Before
    public void beforeEach(){
        sword1 = new Weapon("Swordy mcSwordFace", 10, WeaponType.SWORD, ItemDamageType.SLASHING, StatusEffect.NONE, 5);
        dagger1 = new Weapon("Mr. Spikey", 5, WeaponType.DAGGER, ItemDamageType.PIERCING, StatusEffect.NONE, 2);
        pocketsand1 = new Weapon("Powder of blinding", 1, WeaponType.POCKETSAND, ItemDamageType.NONE, StatusEffect.BLINDING, 0);
    }

    @Test
    public void weaponHasName(){
        assertEquals("Swordy mcSwordFace", sword1.getName());
    }

    @Test
    public void weaponHasWeight(){
        assertEquals(10, sword1.getWeight());
    }
    @Test
    public void weaponHasDamageType(){
        assertEquals(ItemDamageType.SLASHING, sword1.getDamageType());
    }
    @Test
    public void weaponHasStatusEffect(){
        assertEquals(StatusEffect.NONE, sword1.getStatusEffect());
    }
    @Test
    public void weaponHasDamageamount(){
        assertEquals(5, sword1.getDamageAmount());
    }


}
