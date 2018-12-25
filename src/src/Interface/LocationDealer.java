package src.Interface;

import javax.xml.stream.Location;
import java.util.ArrayList;

public interface LocationDealer {

    ArrayList<Location> getLocations ();

    void addLocationToLocationList(Location location);
}
