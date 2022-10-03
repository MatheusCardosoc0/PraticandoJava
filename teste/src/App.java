import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Digite primeiro seu nome depos sua idade e por ultimo sua profissão.");

        String name = "josoel";
        int age = 8;
        String profission = "policial";

        Scanner teclado = new Scanner(System.in);

        name = teclado.next();
        age = teclado.nextInt();
        profission = teclado.next();

        System.out.println("Seu nome é " + name);
        System.out.println("Sua idade é " + age);
        System.out.println("Sua profissão é " + profission);
    }
}
