
public class Defector extends Organism {
  // Constructors
  
  public Defector() {
    super();
  }
  
  // Methods
  @Override
  public String getType() {
    return "Defector";
  }
  
  @Override
  public Organism reproduce() {
    Organism baby = new Defector(); // requires more implementation
    return baby;
  }
  
  @Override
  public double getCooperationProbability() {
    return 0;
  }
  
  @Override
  public boolean cooperates() {
    return false;
  }
}
