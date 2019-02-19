
public class Organism {

  // Fields

  int energylevel;

  // Constructors

  public Organism() {
    energylevel = 0;
  }
  
  // Methods
  
  public int getEnergy() {
    return energylevel;
  }
  
  public void incrementEnergy() {
    this.energylevel++;
  }

  public void decrementEnergy() {
    if (this.energylevel >= 1) {
      this.energylevel--;
    } else {
      this.energylevel = 0;
      //throw new Exception("Energy cannot be decremented below 0");
      // note for future: make it impossible to decrement below 0 instead?
    } // else
  } // decrementEnergy

  public void update() {
    this.incrementEnergy();
  }
  
  public String getType() {
    return null;
  }
  
  public Organism reproduce() {
    return this;
  }
  
  public double getCooperationProbability() {
    return -1;
  }
  
  public boolean cooperates() {
    return false;
  }
  
} // class
