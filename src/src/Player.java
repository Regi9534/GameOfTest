package src;

import src.Interface.Location;

import java.util.HashMap;


public class Player implements src.Interface.Player {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    Game game;
    src.Location position;
    Inventory inventory;

    public Player(Game game, Location startingLocation){
        this.game = game;
        this.position = (src.Location) startingLocation;
        this.inventory = new Inventory(game);
    }


    @Override
    public Location getLocation() {
        return this.position;
    }

    public void lookArround(){
        String returnString = "";
        HashMap allNeighbor = position.getNeighborMap();
        for ( Object direction: allNeighbor.keySet()) {
                src.Location value = (src.Location) allNeighbor.get(direction);

                //TODO
                // BOenke überarbeite den scheiß bitte. :)
                returnString += direction  + " " + value.getName();
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
}
