package livraria;

public class Livro {
  protected String titulo;
  protected Autor autor;
  protected String genero;
  protected int edicao;

  public Autor getAutor() {
    return autor;
  }

  public int getEdicao() {
    return edicao;
  }

  public String getGenero() {
    return genero;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public void setEdicao(int edicao) {
    this.edicao = edicao;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Livro(String titulo,
      Autor autor,
      String genero,
      int edicao) {

    super();
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.edicao = edicao;
  }

  public Livro() {
  }

  public void info(){
    System.out.println("Titulo: " + titulo);
    autor.info();
    System.out.println("Genero: " + genero);
    System.out.println("Edicao: " + edicao);
  }
}
