import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    int peso = teclado.nextInt();
    Double altura = teclado.nextDouble();

    Double imc = peso / (altura * altura);

    System.out.println("Seu IMC é " + imc);
  }
}

