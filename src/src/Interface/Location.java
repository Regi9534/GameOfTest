package src.Interface;

public interface Location {

    public Location getNeighborLocation(String direction);

    public void setNeighborLocation(String direction, Location location);

     String getName();
}