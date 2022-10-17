package curso;

public class Principal {
  public static void main(String[] args){

    Aluno a = new Aluno("math", 2334, new Curso("Matematica", 1400, 90));

    a.info();
  }
}
