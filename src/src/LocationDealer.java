package src;

import src.Interface.Location;

import java.util.ArrayList;

public class LocationDealer implements src.Interface.LocationDealer {
    ArrayList<Location> locationsList;
    Game game;
    public LocationDealer(Game game) {
        this.game =game;
        locationsList = new ArrayList<>();
    }

    public void buildLocations(){
        createLocations();
        setNeighbors();
    }
    @Override
    public ArrayList<Location> getLocations() {
        return locationsList;
    }

    @Override
    public void addLocationToLocationList(Location location) {
        locationsList.add(location);
    }

    @Override
    public Location getLocationByName(String locationName) {
        return locationsList.stream().filter(s-> s.getName() == locationName).findAny().get();
    }

    public void createLocations() {
        Location garden = new src.Location("garden", game);
        Location house = new src.Location( "house" ,game);
    }
    public void setNeighbors(){
        getLocationByName("garden").setNeighborLocation("NORTH", getLocationByName("house"));

    }
}
