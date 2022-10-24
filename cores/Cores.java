package cores;

enum cor {
  GREEN,
  YELLOW,
  BLACK,
  PURPLE
}

public class Cores {
  private String nome;
  private int idade;
  private cor colors;

  public Cores(
      String nome,
      int idade,
      cor colors) {
    this.colors = colors;
    this.idade = idade;
    this.nome = nome;
  }

  public void msg() {
    switch (colors) {
      case GREEN:
        System.out.println("Verde");
        break;
      case YELLOW:
        System.out.println("amarelo");
        break;
      case PURPLE:
        System.out.println("roxo");
        break;
      case BLACK:
        System.out.println("preto");
        break;
    }
  }

}
