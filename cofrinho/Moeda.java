package cofrinho;

public class Moeda {
  private String nome;
  private double valor;

  public Moeda(String nome , double valor){
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }
}
