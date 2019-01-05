package src;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    String name;
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    ArrayList<Item> content = new ArrayList();
    Game game;

    public Inventory(Game game, String name) {
        this.game = game;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public List<Item> getContent() {
        return this.content;
    }

    public boolean checkItemInInventory(Item item) {
        if (getContent().contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    public void addItemToContent(Item item) {
        content.add(item);
        consoleEnviroment.printOut(item.getName() + " was added to " + this.getName() + "\n");
    }

    public void removeItemFromContent(Item item) {
        if (content.contains(item))
            content.remove(item);
        consoleEnviroment.printOut(item.getName() + " was removed from " + this.getName() + "\n");
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich shoud transfered
     * @return sucessfulstate
     */
    public boolean transferItemToOtherInventory(Inventory otherInventory, Item item) {
        if (this.checkItemInInventory(item)) {
            this.removeItemFromContent(item);
            otherInventory.addItemToContent(item);
            consoleEnviroment.printOut(item.getName() + " was given from " + this.getName() + " to " + otherInventory.getName()+ "\n");
            return true;
        } else {
            consoleEnviroment.printOut(item.getName() + " was not found in " + otherInventory.getName() + "\n");
            return false;
        }
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich should transfered
     */
    public void getItemFromOtherIventoryWithOutResponse(Inventory otherInventory, Item item) {
        if (otherInventory.checkItemInInventory(item)) {
            otherInventory.removeItemFromContent(item);
            this.addItemToContent(item);
        } else {
            consoleEnviroment.printOut(item.getName() + " was not found in " + otherInventory.getName() + "\n");
        }
    }

    /**
     * @param otherInventory checked to contains item and remove item from there
     * @param item           wich should transfered
     * @return sucessfulstate
     */
    public boolean getItemFromOtherIventoryWithResponse(Inventory otherInventory, Item item) {
        if (otherInventory.checkItemInInventory(item)) {
            otherInventory.removeItemFromContent(item);
            this.addItemToContent(item);
            consoleEnviroment.printOut(item.getName() + " was given from " + otherInventory.getName() + " to " + this.getName() + "\n");
            return true;
        } else {
            consoleEnviroment.printOut(item.getName() + " was not found in " + otherInventory.getName() + "\n");
            return false;
        }
    }
}
