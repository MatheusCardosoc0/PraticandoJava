package curso;

public class Aluno {
  private String nome;
  private int matricula;
  private Curso curso;

  public Aluno(String nome, int matricula, Curso curso){
    this.curso = curso;
    this.matricula = matricula;
    this.nome = nome;
  }

  public void info(){
    System.out.println("Aluno :" + nome);
    System.out.println("matricula :" + matricula);
    curso.info();
  }

}
