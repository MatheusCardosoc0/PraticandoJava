package ingresso;

public class IngressoVip extends Ingresso {
  public IngressoVip(String nome, double valor, double adicional) {
    super(nome, valor);
    this.adicional = adicional;
  }

  double adicional;

  @Override
  public void info(){
    super.info();
    System.out.println("adicional" + adicional);
    System.out.println("total:" + (valor + adicional));
  }
}
