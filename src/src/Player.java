package src;

import src.Interface.Location;



public class Player implements src.Interface.Player {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    Game game;
    Location position;
    Inventory inventory;

    public Player(Game game, Location startingLocation){
        this.game = game;
        this.position = startingLocation;
        this.inventory = new Inventory(game);
    }


    @Override
    public Location getLocation() {
        return this.position;
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
