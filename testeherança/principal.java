package testeherança;

public class principal {
  public static void main(String[] args){
    chá a = new chá("preto", "Hortelam", 4);

    chicará b = new chicará("preto", 8);

    System.out.println(a.quantidade);

    System.out.println(b.quantidade);

    a.info();


  }
}
