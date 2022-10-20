package livraria;

public class LivroDigital extends Livro {
  private int dawnload;
  private double tamanho;

  public int getdawnload() {
    return dawnload;
  }

  public double gettamanho() {
    return tamanho;
  }

  public void settamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public void setdawnload(int dawnload) {
    this.dawnload = dawnload;
  }

  public LivroDigital(Autor autor, String titulo, String genero, int edicao, int dawnload, double tamanho) {
    super(titulo, autor, genero, edicao);
    this.dawnload = dawnload;
    this.tamanho = tamanho;
  }

  public LivroDigital(){}

  @Override
  public void info() {
    super.info();
    System.out.println("dawnload: " + dawnload);
    System.out.println("tamanho: " + tamanho);
  }

}
