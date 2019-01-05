package src;

import java.util.HashMap;

public class Location implements src.Interface.Location {
    private Game game;
    private String name;
    private HashMap<String, Location> neighborMap;
    Inventory inventory;

    public Location(String name, Game game) {
        this.name = name;
        this.game = game;
        neighborMap = new HashMap<String, Location>();
        game.locationDealer.addLocationToLocationList(this);
        this.inventory = new Inventory(game);
    }

    public Game getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    public Location getNeighborLocation(String d) {
        String direction=d.toUpperCase();
        if (neighborMap.containsKey(direction)) {
            return neighborMap.get(direction);
        } else {
            System.out.println("No location in direction " + direction + ", returning NULL");
            return null;
        }
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setNeighborLocation(String direction, src.Interface.Location location) {
        neighborMap.put(direction.toUpperCase(), (Location) location);
    }

}
