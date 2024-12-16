package abstraction.utility.abs;

public interface Tree {
    public String getFruit();

    public default void grow() {
        System.out.println("Wow, I'm a taller tree!");
    }
}
