package abstraction.utility.inter;

public class FordF150 implements PassengerVehicle, Car {
    @Override
    public int getPassengerCount() {
        return 4;
    }

    @Override
    public void honkHorn() {
        System.out.println("BRRR BRRR");
    }
}
