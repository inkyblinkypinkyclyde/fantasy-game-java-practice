import Items.Armour;
import Items.ArmourType;
import Items.ItemDamageType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {
    Armour helmet;
    @Before
    public void beforeEach(){
        helmet = new Armour("Shiny saucepan", 2, ArmourType.HEAD, 1, ItemDamageType.NONE);
    }
    @Test
    public void armourHasArmourType(){
        assertEquals(ArmourType.HEAD, helmet.getArmourType());
    }

    @Test
    public void armourHasAddedAC(){
        assertEquals(1, helmet.getAddedAC());
    }

    @Test
    public void armourHasResistances(){
        assertEquals(ItemDamageType.NONE, helmet.getDamageTypeResistance());
    }
}
