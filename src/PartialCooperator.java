import java.util.Random;

public class PartialCooperator extends Organism {

  // Constructors

  public PartialCooperator() {
    super();
  }

  // Methods

  // method to return the type (PartialCooperator)
  @Override
  public String getType() {
    return "PartialCooperator";
  }

  // method to make a new organism of type PartialCooperator
  @Override
  public Organism reproduce() {
    Organism baby = new PartialCooperator(); // requires more implementation
    return baby;
  }

  // method to return cooperation probability (.5)
  @Override
  public double getCooperationProbability() {
    return 0.5;
  }

  // method to return whether or not organism cooperates
  // * returns true about half the time and false about half the time, randomly
  @Override
  public boolean cooperates() {
    Random rand = new Random();
    int coin = rand.nextInt(2);
    return coin == 0;
  }
}
