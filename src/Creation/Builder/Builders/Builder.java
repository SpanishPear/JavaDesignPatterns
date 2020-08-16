package Creation.Builder.Builders;

import Creation.Builder.Cars.Type;
import Creation.Builder.Components.Engine;
import Creation.Builder.Components.GPSNavigator;
import Creation.Builder.Components.Transmission;
import Creation.Builder.Components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}