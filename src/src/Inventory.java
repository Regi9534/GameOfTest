package src;

import java.util.ArrayList;
import java.util.HashMap;
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
}
