
public class ALifeSim {

  public static void main(String[] args) throws Exception {
    Pair<String, Integer> p1 = new Pair<String, Integer>("Cooperator", Integer.valueOf(args[1]));
    Pair<String, Integer> p2 = new Pair<String, Integer>("Defector", Integer.valueOf(args[2]));
    Pair<String, Integer> p3 = new Pair<String, Integer>("PartialCooperator", Integer.valueOf(args[3]));
    
    Pair<String, Integer>[] pairArray = new Pair[3];
    // "Generics in Java are stupid and bad because they were thrown in after the fact"
 
    pairArray = new Pair[] {p1, p2, p3};
   Population pop = new Population(pairArray);
    
   
    for (int i = 0; i < Integer.valueOf(args[0]); i++) {
      pop.update();
    }
    
   
   System.out.println(pop.getPopulationCounts()[0].getRight());
   System.out.println(pop.calculateCooperationMean());
   pop.orgs[8].incrementEnergy();
   System.out.println(pop.orgs[4].getCooperationProbability());
  }

}
