package computador;

public class NoteBook extends Computador{
  int polegadasTela;

  public NoteBook(int GbMemoria, int NumProcessador, int polegadasTela) {
    super(GbMemoria, NumProcessador);
    this.polegadasTela = polegadasTela;
  }

  @Override
  double calculaValor() {
    double total = 250*GbMemoria + 500*NumProcessador + 100*polegadasTela;
    return total;
  }
  
}
