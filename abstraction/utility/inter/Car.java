package abstraction.utility.inter;

public interface Car {
    void honkHorn();
    
    default void drive() {
        System.out.println("Vrooommmm");
    }
}
