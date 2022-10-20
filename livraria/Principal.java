package livraria;

public class Principal {
  public static void main(String[] args) {

    LivroDigital ld = new LivroDigital(new Autor("jack sparrow", "amazonas", "jackSparrowps5@gmail.com"),"Big Brother",
        "romance cult", 5, 30000, 1000);


        ld.info();
  }
}
