import Characters.Barbarian;
import Characters.Caster;
import Characters.Cleric;
import Characters.Inventory;
import Items.ItemDamageType;
import Items.StatusEffect;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CasterTest {
    Cleric cleric1;
    Barbarian barbarian1;
    Inventory inventory;

    @Before
    public void beforeEach(){
        cleric1 = new Cleric("Philip", 20, 10, 10, inventory, new HashMap<>(), StatusEffect.NONE, ItemDamageType.NONE, 20, 20);
        barbarian1 = new Barbarian("Ron", 20, 10, 10, inventory, new HashMap<>(), StatusEffect.NONE, ItemDamageType.NONE);
    }

    @Test
    public void clericCanHealEnoughMPandEnoughHPToSpare(){
        cleric1.heal(barbarian1);
        assertEquals(15, barbarian1.getHP());
    }

    @Test
    public void clericCannotHealNotEnoughMPandEnoughHPToSpare(){
        cleric1.setMP(4);
        cleric1.heal(barbarian1);
        assertEquals(10, barbarian1.getHP());
    }

    @Test
    public void clericCannotHealEnoughMPbutNotEnoughHPToSpare(){
        barbarian1.setHP(18);
        cleric1.heal(barbarian1);
        assertEquals(20, barbarian1.getHP());
    }

}
