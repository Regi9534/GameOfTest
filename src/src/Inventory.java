package src;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    ArrayList<Item> conten = new ArrayList();
    Game game;

    public Inventory(Game game) {
        this.game = game;
    }

    public List<Item> getContent() {
        return this.conten;
    }

    public boolean checkItemInInvetory(Item item) {
        if (getContent().contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    public void addItemToContent(Item item) {
        conten.add(item);
        consoleEnviroment.printOut("");
        //Inventory have add item
    }

    public void removeItemFromContent(Item item) {
        if (conten.contains(item))
            conten.remove(item);
        consoleEnviroment.printOut("");
        //Inventory remove item
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich shoud transfered
     * @return sucessfulstate
     */
    public boolean transferItemToOtherIventory(Inventory otherInventory, Item item) {
        if (otherInventory.checkItemInInvetory(item)) {
            otherInventory.removeItemFromContent(item);
            this.addItemToContent(item);
            return true;
        } else {
            consoleEnviroment.printOut("");
            //cant find item in other Invetory
            return false;
        }
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich should transfered
     */
    public void getItemFromOtherIventoryWithOutResponse(Inventory otherInventory, Item item) {
        if (otherInventory.checkItemInInvetory(item)) {
            otherInventory.removeItemFromContent(item);
            this.addItemToContent(item);
        } else {
            consoleEnviroment.printOut("");
            //cant find item in other Invetory
        }
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich should transfered
     * @return sucessfulstate
     */
    public boolean getItemFromOtherIventoryWithResponse(Inventory otherInventory, Item item) {
        if (otherInventory.checkItemInInvetory(item)) {
            otherInventory.removeItemFromContent(item);
            this.addItemToContent(item);
            return true;
        } else {
            consoleEnviroment.printOut("");
            //cant find item in other Invetory
            return false;
        }
    }
}
