package collections;

import java.util.Collection;
import java.util.HashMap;

public class Map {
  public static void main(String[] args){
    HashMap<String , String> Capitais = new HashMap();

    Capitais.put("Alemanha", "Berlin");
    Capitais.put("Uruguai", "Monetevideo");
    Capitais.put("Colombia", "Caracas");
    Capitais.put("Suiça", "Berna");

    System.out.println(Capitais);
    System.out.println(Capitais.get("Suiça"));
  }
  
}
