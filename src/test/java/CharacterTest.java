
import Characters.BodyPart;
import Characters.Inventory;
import Characters.Sorcerer;
import Items.StatusEffect;

import Items.ItemDamageType;
import Items.MiscItems;
import Items.Weapon;
import Items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    Sorcerer harryPotter;
    MiscItems carrot;
    Weapon pocketsand;

    @Before
    public void beforeEach(){
        harryPotter = new Sorcerer("Harry Potter", 20, 20, 10, new Inventory(), new HashMap<>(), StatusEffect.NONE, ItemDamageType.NONE, 20, 20);
        carrot = new MiscItems("Tasty carrot", 1);
        pocketsand = new Weapon("Powder of blinding", 1, WeaponType.POCKETSAND, ItemDamageType.NONE, StatusEffect.BLINDING, 0);
    }
    @Test
    public void characterHasName(){
        assertEquals("Harry Potter", harryPotter.getName());
    }

    @Test
    public void characterHasMaxHP(){
        assertEquals(20, harryPotter.getMaxHP());
    }

    @Test
    public void characterHasHP(){
        assertEquals(20, harryPotter.getHP());
    }

    @Test
    public void characterHasAC(){
        assertEquals(10, harryPotter.getAC());
    }

    @Test
    public void characterHasEmptyInventory(){
        assertEquals(0, harryPotter.getInventory().size());
    }

    @Test
    public void characterHasNoStatusEffects(){
        assertEquals(StatusEffect.NONE, harryPotter.getStatusEffect());
    }

    @Test
    public void characterHasNoNaturalResistances(){
        assertEquals(ItemDamageType.NONE, harryPotter.getNaturalResistances());
    }

    @Test
    public void sorcererHasMaxMP(){
        assertEquals(20, harryPotter.getMaxHP());
    }

    @Test
    public void sorcererHasMP(){
        assertEquals(20, harryPotter.getMP());
    }

    @Test
    public void characterCanPikUpItem(){
        harryPotter.addItemToInventory(carrot);
        assertEquals(1, harryPotter.getInventory().size());
    }

    @Test
    public void characterCanDropItem(){
        harryPotter.addItemToInventory(carrot);
        harryPotter.removeItemFromInventory(carrot);
        assertEquals(0, harryPotter.getInventory().size());
    }

    @Test
    public void characterCanEquipItem(){
        harryPotter.addItemToInventory(carrot);
        harryPotter.equipItem(BodyPart.RIGHTHAND,  carrot);
        harryPotter.equipItem(BodyPart.RIGHTHAND,  pocketsand);
        assertEquals(carrot, harryPotter.getEquipped().get(BodyPart.RIGHTHAND));
    }
}
