package nota;

public class Notas {
  private double nota1;
  private double nota2;
  private int faltas;

  public double getNota1() {
    return nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public int getFaltas() {
    return faltas;
  }

  public void setNota1(double nota){
    nota1 = nota;
  }

  public void setNota2(double nota){
    nota2 = nota;
  }

  public void setfalta(int falta){
    faltas = falta;
  }

  public void Resultado(){
    if(faltas > 7){
      System.out.println("Você reprovou por faltas");
    }
    else if((nota1 + nota2) / 2 < 7 ){
      System.out.println("Aluno reprovado as notas " + nota1 + " e " + nota2 + "Não foram o suficiente para passar");
    } else{
      System.out.println("Parabens você passou!");
    }
  }


}
