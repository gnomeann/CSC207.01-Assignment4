public class Cooperator extends Organism {

  // Constructors
  
  public Cooperator() {
    super();
  }
  
  // Methods
  
  // method to return the type, "Cooperator"
  @Override
  public String getType() {
    return "Cooperator";
  }
  
  // method to make a new organism of type Cooperator
  @Override
  public Organism reproduce() {
    Organism baby = new Cooperator(); // requires more implementation
    return baby;
  }
  
  // method to return cooperation probability (1)
  @Override
  public double getCooperationProbability() {
    return 1;
  }
  
  // method to return if the organism cooperates (true)
  @Override
  public boolean cooperates() {
    return true;
  }
  
  // method to increment the energy level of the organism
  @Override
  public void update() {
    this.incrementEnergy();
  }
  
}
