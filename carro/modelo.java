package carro;

public class modelo {
  String cor;
  String carro;
  KmEmMs velocidade;

  modelo(String cor, String carro, KmEmMs velocidade){
    this.cor = cor;
    this.carro = carro;
    this.velocidade = velocidade;
  }

  void info(){
    System.out.println("Modelo: " + carro);
    System.out.println("Cor: " + cor);
    System.out.println("Km/h para m/s: " + velocidade.Calc());
  }
}
