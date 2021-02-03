package factorydesignpattern;

public abstract class Bike {
  /**
     * All of my instance variables.
     */
  protected String name;
  protected Double price;
  protected int numWheels;
  protected boolean hasPeddals;
  protected boolean hasTraingingWheels;

  /**
     * Method that "creates" a bike
     * Just print statements from createFrame(),
     * addWheels(), addPedals(),getPrice()
     */
  public void createBike() {
    createFrame();
    addWheels();
    addPedals();
    getPrice();
  }

  /**
     * Prints a string with regards to creating the frame
     */
  private void createFrame() {
    System.out.println("Assembling " + this.name + " frame");
  }

  /**
     * Prints a string with regards to wheel count and trainging wheel status
     */
  private void addWheels() {
    if (this.numWheels > 0) {
      System.out.println("Adding " + this.numWheels + " wheel(s)");
      if (this.hasTraingingWheels == true) {
        System.out.println("Adding training wheels");
      }
    }
  }

  /**
     * Prints a string if the bike has pedals 
     */
  private void addPedals() {
    if (this.hasPeddals == true) {
      System.out.println("Adding pedals");
    }
  }

  /**
     * Prints the price of the bike...
     */
  public void getPrice() {
    System.out.println("Price: $" + this.price);
  }
}
