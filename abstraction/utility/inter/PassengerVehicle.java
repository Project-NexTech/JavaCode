package abstraction.utility.inter;

public interface PassengerVehicle {
    int getPassengerCount();

    default void unloadPassengers() {
        System.out.println("Passengers unloaded!");
    }
}
