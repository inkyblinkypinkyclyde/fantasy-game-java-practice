package Characters;

import Items.Items;


import java.util.ArrayList;

public class Inventory {
    ArrayList<Items> inventory;

    public Inventory(){
        this.inventory = new ArrayList<Items>();
    }
    public ArrayList<Items> getInventory(){
        return inventory;
    }
    public int getInventorySize(){
        return inventory.size();
    }
    public void addItemToInventory(Items item) {
        inventory.add(item);
    }
    public boolean removeItemFromInventory(Items itemToRemove) {
        return inventory.remove(itemToRemove);
    }

    public int getWeightOfInventory(){
        int totalWeight = 0;
        for(Items item: inventory){
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public Items pullItemOutOfInventory(Items item){
        if(inventory.remove(item)){
            return item;
        }else{
            return null;
        }
    }
    public Items findItemInInventoryByName(String itemName){
        for(Items itemInInventory: inventory){
            if(itemInInventory.getName() == itemName){
                return itemInInventory;
            }else{
                return null;
            }
        }
        return null;
    }
}
