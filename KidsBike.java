package factorydesignpattern;

public class KidsBike extends Bike {
  /**
     * Constructor for kidsbike bike
     */
  public KidsBike() {
    name = "Kids Bike";
    price = 80.99;
    numWheels = 2;
    hasPeddals = true;
    hasTraingingWheels = true;
  }
}