package abstraction;

import abstraction.utility.inter.FordF150;
import abstraction.utility.inter.HondaCivic;

public class ExampleTwo {
    public static void main(String[] args) {
        FordF150 fordF150 = new FordF150();
        HondaCivic hondaCivic = new HondaCivic();

        fordF150.drive();
        fordF150.honkHorn();

        hondaCivic.unloadPassengers();
        hondaCivic.honkHorn();
    }
}
