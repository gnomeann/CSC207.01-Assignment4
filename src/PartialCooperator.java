
public class PartialCooperator extends Organism {

  // Constructors
  
  public PartialCooperator() {
    super();
  }
  
  // Methods
  @Override
  public String getType() {
    return "PartialCooperator";
  }
  
  @Override
  public Organism reproduce() {
    Organism baby = new PartialCooperator(); // requires more implementation
    return baby;
  }
  
  @Override
  public double getCooperationProbability() {
    return 0.5;
  }
  
  @Override
  public boolean cooperates() {
    return true; // note for future: double check, figure out
  }
  
}
