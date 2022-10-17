package curso;

public class Curso {
  private String nome;
  private int mensalidade;
  private double desconto;

  public Curso(String nome, int mensalidade, double desconto){
    this.nome = nome;
    this.mensalidade = mensalidade;
    this.desconto = desconto;
  }

  private double pagamento(){
    return mensalidade - (mensalidade * (desconto /100));
  }

  public void info(){
    System.out.println("\ncurso de: " +nome);
    System.out.println(mensalidade);
    System.out.println("o valor da mensalidade é" + pagamento());
    System.out.println("o desconto é de" + desconto);
  }
}
