package calculo;

public class Principal {
  public static void main(String[] args){
    Avaliacao a = new Avaliacao(3, 7, 9);

    System.out.println(a.aritimetica());
    System.out.println(a.ponderada());

    Aluno d = new Aluno("matheus", "matematica", "6");

    System.out.println(d.info() + "\n nota da prova: "+ a.aritimetica());
  }
}
