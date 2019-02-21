
public class Organism {

  // Fields

  int energylevel;

  // Constructors

  public Organism() {
    energylevel = 0;
  }
  
  // Methods
  
  // method to return the energylevel
  public int getEnergy() {
    return energylevel;
  }
  
  // method to increment energylevel
  public void incrementEnergy() {
    this.energylevel++;
  }

  // method to decrement energy level
  //  * energy level cannot go below 0
  public void decrementEnergy() {
    if (this.energylevel >= 1) {
      this.energylevel--;
    } else {
      this.energylevel = 0;
    } // else
  } // decrementEnergy

  //
  public void update() {
    this.incrementEnergy();
  }
  
  // method to return type of organism (overridden in subclasses)
  public String getType() {
    return null;
  }
  
  // method to return a new organism of appropriate type (overridden in subclasses)
  public Organism reproduce() {
    return this;
  }
  
  // method to return cooperation probability (overridden in subclasses)
  public double getCooperationProbability() {
    return -1;
  }
  
  // method to return whether or not an organism cooperates (overridden in subclasses)
  public boolean cooperates() {
    return false;
  }
  
} // class
