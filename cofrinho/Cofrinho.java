package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
  private ArrayList<Moeda> cofrinho = new ArrayList<>();

  public void AddCoin(Moeda moeda) {
    cofrinho.add(moeda);
  }

  public double Total(){
    double total = 0;
    for(Moeda m : cofrinho){
      total += m.getValor();
    }

    return total;
  }
}
