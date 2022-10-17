package cofrinho;

public class Principal {
  public static void main(String[] args){
    Cofrinho a = new Cofrinho();

    a.AddCoin(new Moeda("real", 24));
    a.AddCoin(new Moeda("real", 24));


    System.out.println(a.Total());
  }
}
