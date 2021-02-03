package factorydesignpattern;

public class BikeStore {
  /**
     * Honestly not sure what this is for. 
     */
  public BikeStore() {}

  /**
     * 
     * @param bikeType
     * @return a bike after it has been created based on String bikeType
     */
  public Bike orderBike(String bikeType) {
    Bike bike = createBike(bikeType);
    bike.createBike();
    return bike;
  }
  /**
     * 
     * @param bikeType
     * @return creates a new bike based off bikeType and it assings it with designated bikeType
     */
  protected Bike createBike(String bikeType) {
    Bike bike;
    if (bikeType.equals("tricycle")) {
      bike = new Tricycle();
    }
    else if (bikeType.equals("strider")) {
      bike = new Strider();
    }
    else {
      bike = new KidsBike();
    }
    return bike;
  }
}
