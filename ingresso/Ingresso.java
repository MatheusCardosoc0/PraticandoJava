package ingresso;

public class Ingresso {
  String nome;
  double valor;

  public Ingresso(String nome,
  double valor){
    this.nome = nome;
    this.valor = valor;
  }

  public void info(){
    System.out.println("nome: " + nome);
    System.out.println("valor: " + valor);
  }
}
