package computador;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args){
    Descktop a = new Descktop(8, 7, 600 );
    NoteBook b = new NoteBook(8, 4, 15 );

    Computador comp;

    ArrayList<Computador> listaComputadores = new ArrayList<>();

    listaComputadores.add(a);
    listaComputadores.add(b);
    listaComputadores.add(new Descktop(4, 4, 10));

    double total =0;

    for(Computador c : listaComputadores){
      System.out.println(c.calculaValor());
    }
  }
}
