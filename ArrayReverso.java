import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayReverso {
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o tamanho da lista");

    ArrayList<String> lista = new ArrayList<String>();
    int quantity = teclado.nextInt();
    for(int i = 0;i < quantity; i++){
      String name = teclado.next();
      lista.add(name);
    }
    /*System.out.println("");
    for(int i = lista.size() - 1; i >= 0; i--){
      System.out.println(lista.get(i));
    }*/

    Collections.reverse(lista);
    System.out.println(lista);
  }
}
