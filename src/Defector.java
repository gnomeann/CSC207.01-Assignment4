
public class Defector extends Organism {
  // Constructors
  
  public Defector() {
    super();
  }
  
  // Methods
  
  // method to return the type, "Defector"
  @Override
  public String getType() {
    return "Defector";
  }
  
  // method to make a new organism of type defector
  @Override
  public Organism reproduce() {
    Organism baby = new Defector(); // requires more implementation
    return baby;
  }
  
  // method to return cooperation probability (0)
  @Override
  public double getCooperationProbability() {
    return 0;
  }
  
  // method to return whether or not organism cooperates (false)
  @Override
  public boolean cooperates() {
    return false;
  }
}
