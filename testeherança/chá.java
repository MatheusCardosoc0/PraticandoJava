package testeherança;

public class chá extends chicará {
  public String tipo_de_chá;


  public chá(String tipo_de_chá, String cor , Number quantidade){
    super(cor, quantidade);
    this.tipo_de_chá = tipo_de_chá;
  }

  public void info(){
    System.out.println("Chá: " + super.quantidadeInc());
  }
}
