package src;

public class Game {
    LocationDealer locationDealer;
    Player player;
    Command command;

    public Game (){
        this.locationDealer = new LocationDealer(this);
        this.player = new Player(this ,locationDealer.getLocations().get(0));
        this.command = new Command();
    }


    public LocationDealer getLocationDealer(){
        return this.locationDealer;
    }

    public Player getPlayer (){
        return this.player;
    }

    public Command getCommand (){
        return this.command;
    }
}
