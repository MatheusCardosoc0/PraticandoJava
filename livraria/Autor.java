package livraria;

public class Autor {
  private String nome;
  private String nacionalidade;
  private String email;

  public String getEmail() {
    return email;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public String getNome() {
    return nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public Autor(){}
  public Autor(String mome, String nacionalidade, String email){
    super();
    this.nome = mome;
    this.nacionalidade = nacionalidade;
    this.email = email;
  }

  void info() {
    System.out.println("Nome: " + nome);
    System.out.println("Nacionalidade: " + nacionalidade);
    System.out.println("Email: " + email);
  }
}
