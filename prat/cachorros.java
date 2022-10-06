package prat;

public class cachorros {
  String nome;
  int idade;
  String raça;

  void info(){
    System.out.println('\n'+nome);
    System.out.println(idade);
    System.out.println(raça+ '\n');
  }

  static float kelvinToCelsius(float tc){
    return tc + 273;
  }
}
