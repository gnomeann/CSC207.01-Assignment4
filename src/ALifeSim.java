
public class ALifeSim {

  public static void main(String[] args) {
    Pair<String, Integer> p = new Pair<String, Integer>("Cooperator", 3);
    
   // Pair<String, Integer>[] actual_pair = new Pair<String, Integer>[1];
    
 
   //Population pop = new Population(p);
    
    for (int i = 0; i < args[0]; i++) {
      pop.update();
    }
  }

}
