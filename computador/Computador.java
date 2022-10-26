package computador;

public abstract class Computador {
  int GbMemoria , NumProcessador;

  public Computador(int GbMemoria ,int NumProcessador){
    this.GbMemoria = GbMemoria;
    this.NumProcessador = NumProcessador;
  }

  abstract double calculaValor();
}
