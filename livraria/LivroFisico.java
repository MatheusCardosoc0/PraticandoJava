package livraria;

public class LivroFisico extends Livro {
  private int tiragem;
  private int peso;

  public int getTiragem() {
    return tiragem;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setTiragem(int tiragem) {
    this.tiragem = tiragem;
  }

  public LivroFisico(Autor autor, String titulo, String genero, int edicao, int tiragem, int peso) {
    super(titulo, autor, genero, edicao);
    this.tiragem = tiragem;
    this.peso = peso;
  }

  public LivroFisico(){}

  @Override
  public void info() {
    super.info();
    System.out.println("tiragem: " + tiragem);
    System.out.println("peso: " + peso);
  }

}
