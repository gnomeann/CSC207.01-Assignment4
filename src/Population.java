import java.util.Random;

public class Population {

  // Fields
  Organism[] orgs;
  int numCoop = 0;
  int numDefect = 0;
  int numPartialCoop = 0;
  int numTotal = 0;

  // Constructors

  /*
   * Population builds an array of Organisms that keeps track of the number of Organisms of each
   * type Pre-conditions: counts needs to be length 3 each pair must contain a string and an integer
   * (in that order) the string must be Cooperator, Defector, or PartialCooperator Post-conditions:
   * Initializes all fields according to input
   * 
   * NOTE: Our code is meant to handle input
   */
  public Population(Pair<String, Integer>[] counts) {
    for (int i = 0; i < counts.length; i++) {
      if (counts[i].getLeft().contentEquals("Cooperator")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          numCoop++; // count number of Cooperators
        } // for
      } else if (counts[i].getLeft().contentEquals("Defector")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          numDefect++; // count number of Defectors
        } // for
      } else if (counts[i].getLeft().contentEquals("PartialCooperator")) {
        for (int j = 0; j < counts[i].getRight(); j++) {
          numPartialCoop++; // count number of PartialCooperators
        } // for
      } else {
        throw new IllegalArgumentException();
      }
    } // for

    numTotal = numCoop + numDefect + numPartialCoop;
    orgs = new Organism[numTotal];
    int k = 0;
    for (int i = 0; i < numCoop; i++) {
      orgs[k++] = new Cooperator();
    }
    for (int i = 0; i < numDefect; i++) {
      orgs[k++] = new Defector();
    }
    for (int i = 0; i < numPartialCoop; i++) {
      orgs[k++] = new PartialCooperator();
    }
  } // Population

  // Methods

  /*
   * update adjusts each Organism's energy level according to its type Pre-conditions: n/a
   * Post-conditions: the length of orgs will not change Program loops through all Organisms in
   * orgs, and the following is applied to each: If a Cooperator, the energy level remains constant
   * and 8 energy is distributed to other Organisms If a Defector, the energy level automatically
   * increases by 1 If a PartialCooperator, there is a 50% chance of either above option If an
   * Organism's energy level >= 10, it will reproduce (replacing a random Organism with a copy of
   * the reproducer)
   */
  public void update() {
    Random rand = new Random(); // used
                                // https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
    for (int i = 0; i < orgs.length; i++) {

      if (orgs[i].cooperates()) {
        orgs[i].decrementEnergy();
        // if there are 8 or fewer other organisms, every other organism gains one energy (rest is
        // dispersed)
        if (numTotal <= 9) {
          for (int k = 0; k < numTotal; k++) {
            orgs[k].incrementEnergy();
          }
          orgs[i].decrementEnergy();
        } else {
          int[] takenIndices = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1};
          takenIndices[0] = i; // record which organisms already have received energy (and the
                               // original organism)

          for (int l = 0; l < 8; l++) {
            int otherOrg = rand.nextInt(numTotal);

            // If otherOrg already has received energy, generate another otherOrg until you get one
            // that hasn't received energy
            while (elementOf(otherOrg, takenIndices)) {
              otherOrg = rand.nextInt(numTotal);
            }
            orgs[otherOrg].incrementEnergy();

            // record otherOrg as taken
            takenIndices[l + 1] = otherOrg;
          }
        } // else (if numTotal is over 9)

      } else {
        orgs[i].incrementEnergy();
      } // else (if organism doesn't cooperate)

      // Handles reproduction
      if (orgs[i].getEnergy() >= 10) {
        Organism baby = orgs[i].reproduce();
        int n = rand.nextInt(numTotal);

        // There is one more organism of the type of the parent
        if (orgs[i].getType().contentEquals("Cooperator")) {
          numCoop++;
        } else if (orgs[i].getType().contentEquals("Defector")) {
          numDefect++;
        } else if (orgs[i].getType().contentEquals("PartialCooperator")) {
          numPartialCoop++;
        }
        // There is one less organism of the type of the organism being replaced
        // (note: if the baby is the same type as the replaced organism, the counts
        //   will remain the same)
        if (orgs[n].getType().contentEquals("Cooperator")) {
          numCoop--;
        } else if (orgs[n].getType().contentEquals("Defector")) {
          numDefect--;
        } else if (orgs[n].getType().contentEquals("PartialCooperator")) {
          numPartialCoop--;
        }
        
        orgs[n] = baby;
      }
    }
  }

  /*
   * calculateCooperationMean returns the average cooperation probability of all of the Organisms in
   * orgs
   */
  public double calculateCooperationMean() {
    double total = 0;
    for (int i = 0; i < orgs.length; i++) {
      total += orgs[i].getCooperationProbability();
    }
    double mean = total / orgs.length;
    return mean;
  }

  /*
   * getPopulationCounts arranges the number of each Organism type within an array of pairs
   */
  public Pair<String, Integer>[] getPopulationCounts() {
    Pair[] counts = {new Pair("Cooperators", this.numCoop), new Pair("Defectors", this.numDefect),
        new Pair("PartialCooperators", this.numPartialCoop)};
    return counts;
  }

  public static boolean elementOf(int n, int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (n == arr[i]) {
        return true;
      }
    }
    return false;
  }

}
