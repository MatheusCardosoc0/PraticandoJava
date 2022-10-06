package prat;

public class teste {
  public static void main(String[] args){

    cachorros a = new cachorros();

    a.nome = "Mauro";
    a.idade= 12;
    a.raça="Pastor alemão";

    a.info();

    System.out.println(cachorros.kelvinToCelsius(50));
  }
}
