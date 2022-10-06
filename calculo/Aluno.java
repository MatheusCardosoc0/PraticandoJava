package calculo;

public class Aluno {
  String nome, curso, sala;

  Aluno(String nome, String curso, String sala){
    this.nome = nome;
    this.curso = curso;
    this.sala = sala;
  }

  public String info(){

    return "\n nome: "+nome + "\n curso: " + curso + "\n sala: " + sala + "\n";
  }
}
