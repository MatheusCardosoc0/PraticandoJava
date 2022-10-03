import java.util.Scanner;

public class Leonidas {
  public static void main(String[] args){
    int correctValue = 10000;

    Scanner teclado = new Scanner(System.in);
    int guess = teclado.nextInt();

    while(correctValue != guess){

      String question = guess > correctValue? "Um pouco menos...": "Um pouco mais...";
      System.out.println(question);

      /*if(guess > correctValue){
        System.out.println("Um pouco menos ...");
      }
      else if( guess < correctValue){
        System.out.println("Um pouco mais ....");
      }*/
      System.out.println("Tente de novo");
      guess = teclado.nextInt();
    }
    System.out.println("Parabens, você acertou");
  }
}
