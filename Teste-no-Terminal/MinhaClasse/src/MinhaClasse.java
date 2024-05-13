import java.util.Locale;
import java.util.Scanner;

/**Este é um teste para requisitar ao usuario que insira 
 * dados e o condigo interaja com o usuario 
 */


public class MinhaClasse {
    public static void main(String[] args) {
        //Criando o Objeto Scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome>> ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome >> ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade >> ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura>> ");
        float altura = scanner.nextFloat();

        System.out.println("**************************************************************");
        System.out.println("  * Olá meu nome é "+nome+" "+ sobrenome+"                     ");
        System.out.println("  * Tenho "+idade+ " Anos e " + altura + " de altura           ");
        System.out.println("**************************************************************");

    }
}
