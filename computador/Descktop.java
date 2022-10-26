package computador;

public class Descktop extends Computador {

  double acessorios;

  public Descktop(int GbMemoria, int NumProcessador, double acessorios) {
    super(GbMemoria, NumProcessador);
    this.acessorios = acessorios;
  }

  

  @Override
  double calculaValor() {
    double total = 200*GbMemoria + 400*NumProcessador + acessorios;
    return total;
  }
  
}
