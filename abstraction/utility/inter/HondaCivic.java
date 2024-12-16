package abstraction.utility.inter;

public class HondaCivic implements PassengerVehicle, Car {
    
    @Override
    public int getPassengerCount() {
        return 5;
    }
    
    @Override
    public void honkHorn() {
        System.out.println("Hoooonk");
        
    }

}
