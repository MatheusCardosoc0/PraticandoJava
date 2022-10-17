package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args){
    LinkedList<String> pessoas = new LinkedList();

    pessoas.add("Marcos");
    pessoas.add("Pricila");
    pessoas.add("Jorel");
    pessoas.add("Filiph Masterpiece");

    System.out.println(pessoas);

    Collections.sort(pessoas);
    System.out.println(pessoas);

    Collections.shuffle(pessoas);
    System.out.println(pessoas);

    System.out.println(Collections.min(pessoas));
    System.out.println(Collections.max(pessoas));
  }
  
}
