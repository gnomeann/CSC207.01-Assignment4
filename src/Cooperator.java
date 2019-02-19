public class Cooperator extends Organism {

  // Constructors
  
  public Cooperator() {
    super();
  }
  
  // Methods
  @Override
  public String getType() {
    return "Cooperator";
  }
  
  @Override
  public Organism reproduce() {
    Organism baby = new Cooperator(); // requires more implementation
    return baby;
  }
  
  @Override
  public double getCooperationProbability() {
    return 1;
  }
  
  @Override
  public boolean cooperates() {
    return true;
  }
  
  @Override
  public void update() {
    this.incrementEnergy();
  }
  
}
