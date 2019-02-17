
public class Population {

  // Fields
  Organism[] orgs;
  int numCoop = 0;
  int numDefect = 0;
  int numPartialCoop = 0;

  // Constructors
  public Population(Pair<String, Integer>[] counts) {
    int k = 0;
    
    for (int i = 0; i < counts.length; i++) {
      if (counts[i].getLeft().contentEquals("Cooperator")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          Organism org = new Cooperator();
          orgs[k++] = org;
          numCoop++;
        } // for
      } else if (counts[i].getLeft().contentEquals("Defector")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          Organism org = new Defector();
          orgs[k++] = org;
          numDefect++;
        } // for
      } else if (counts[i].getLeft().contentEquals("PartialCooperator")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          Organism org = new PartialCooperator();
          orgs[k++] = org;
          numPartialCoop++;
        } // for
      } else {
        throw new IllegalArgumentException();
      }
    } // for
  } // Population
  
  // Methods
  
  public void update() {
    for (int i = 0; i < orgs.length; i++) {
      orgs[i].update(); // requires more implementation
    }
  }
  
  public double calculateCooperationMean() {
    double total = 0;
    for (int i = 0; i < orgs.length; i++) {
      total += orgs[i].getCooperationProbability();
    }
    double mean = total / orgs.length;
    return mean;
  }
  
  public Pair<String, Integer>[] getPopulationCounts() {
    Pair<String, Integer>[] counts = {new Pair ("Cooperators", numCoop),
                               new Pair ("Defectors", numDefect),
                               new Pair ("PartialCooperators", numPartialCoop)};
    return counts;
  }

}
