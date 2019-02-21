
public class ALifeSim {

  public static void main(String[] args) throws Exception {
    // create array of pairs, based on command line inputs (# iterations # cooperators # defectors #
    // partial cooperators)

    Pair<String, Integer> p1 = new Pair<String, Integer>("Cooperator", Integer.valueOf(args[1]));
    Pair<String, Integer> p2 = new Pair<String, Integer>("Defector", Integer.valueOf(args[2]));
    Pair<String, Integer> p3 =
        new Pair<String, Integer>("PartialCooperator", Integer.valueOf(args[3]));

    Pair<String, Integer>[] pairArray = new Pair[] {p1, p2, p3};
    // "Generics in Java are stupid and bad because they were thrown in after the fact"

    Population pop = new Population(pairArray);

    // Update based on number of iterations (command line)

    for (int i = 0; i < Integer.valueOf(args[0]); i++) {
      pop.update();
    }

    // tests
    // tested cooperator by having a population of 16 defectors + 1 cooperator (1 tick + 100 ticks)
    // tested partials by having a population of 16 defectors + 1 partial (1 tick run 5 times)
    // tested 'reproduce' with a population of 16 defectors (10 ticks)

    System.out.println("After " + args[0] + " ticks:");
    System.out.println("Cooperators = " + pop.getPopulationCounts()[0].getRight());
    System.out.println("Defectors   = " + pop.getPopulationCounts()[1].getRight());
    System.out.println("Partial     = " + pop.getPopulationCounts()[2].getRight());
    System.out.println("");
    System.out.println("Mean Cooperation Probability = " + pop.calculateCooperationMean());
  } // main
} // ALifeSim class
