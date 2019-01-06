package src;

import src.Interface.Location;

import java.util.HashMap;
import java.util.List;


public class Player implements src.Interface.Player {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    Game game;
    src.Location position;
    Inventory inventory;

    public Player(Game game, Location startingLocation){
        this.game = game;
        this.position = (src.Location) startingLocation;
        this.inventory = new Inventory(game ,"PlayerInvetory");
    }


    @Override
    public Location getLocation() {
        return this.position;
    }

    public void lookAround(){
        String returnString = "";
        HashMap allNeighbor = position.getNeighborMap();
        for ( Object direction: allNeighbor.keySet()) {
                src.Location value = (src.Location) allNeighbor.get(direction);
                returnString += "in the " + direction  + " you see a " + value.getName() + "\n";
        }
        List<Item> locationInventoryContent = position.getInventory().getContent();
        returnString+="Around you see:\n";
        for(int index=0; index<locationInventoryContent.size(); index++) {
            returnString+=locationInventoryContent.get(index).getName() + "\n";
        }
        consoleEnviroment.printOut(returnString);
    }

    @Override
    public void goInDirection(String direction) {
        if(this.position.getNeighborLocation(direction)!= null){
            consoleEnviroment.printOut("You stay at: " + this.position.getName() + "\n");
            this.position = this.position.getNeighborLocation(direction);
            consoleEnviroment.printOut("U move to " +direction + " and now u stay at: " + this.position.getName());
        }
    }
    public void listInventory(){
        String returnString = "In have following items in your inventory";
        int counter = 1;
        for (Item item: this.inventory.getContent()
             ) {
            returnString += counter +". " + item.getName() + " : " + item.getDescription();
        }
        consoleEnviroment.printOut(returnString);
    }
}
