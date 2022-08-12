package Characters;

public interface IHeal {
    default void heal(Character character){
        if (character.getHP() <= character.getMaxHP()-5){
            character.setHP(character.getHP()+5);
        } else {
            character.setHP(character.getMaxHP());
        }
    }
}
