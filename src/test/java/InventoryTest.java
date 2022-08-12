import Characters.Inventory;
import Items.MiscItems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InventoryTest {
    Inventory inventory;
    MiscItems carrot;

    @Before
    public void beforeEach(){
        inventory = new Inventory();
        carrot = new MiscItems("Tasty carrot", 1);
    }

    @Test
    public void canAddItemToInventory(){
        inventory.addItemToInventory(carrot);
        assertEquals(1, inventory.getInventorySize());
    }

    @Test
    public void canRemoveItemFromInventory(){
        inventory.addItemToInventory(carrot);
        inventory.removeItemFromInventory(carrot);
        assertEquals(0, inventory.getInventorySize());
    }

    @Test
    public void canReturnRemovedItemFromInventory(){
        inventory.addItemToInventory(carrot);
        assertEquals(carrot, inventory.pullItemOutOfInventory(carrot));
    }

    @Test
    public void getWeightOfInventory(){
        inventory.addItemToInventory(carrot);
        inventory.addItemToInventory(carrot);
        inventory.addItemToInventory(carrot);
        assertEquals(3, inventory.getWeightOfInventory());

    }

    @Test
    public void canFindItemInInventoryReturnTrue(){
        inventory.addItemToInventory(carrot);
        assertEquals(carrot, inventory.findItemInInventoryByName("Tasty carrot"));
    }

    @Test
    public void canFindItemInInventoryReturnFalse(){
        assertEquals(null, inventory.findItemInInventoryByName("Tasty carrot"));
    }
}
