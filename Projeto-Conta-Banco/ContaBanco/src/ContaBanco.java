import java.util.Locale;
import java.util.Scanner;

/**Este código é uma interface de um banco onde solicita 
 * dados do cliente e consequentemente abre uma nova conta para o mesmo .
 */



public class ContaBanco {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        //solicitação dos dados pessoais
        System.out.println("Por favor,Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor,Digite seu sobrenome : ");
        String sobrenome = scanner.next();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Qual é o seu saldo: ");
        float saldo = scanner.nextFloat();

        

        //Exibição do da mensagem com os dados do cliente
         System.out.println("********************************************************************************************************************************************************");
         System.out.println("Ola "+ nome + " "+sobrenome+"!");
         System.out.println(" Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+","+" conta "+ conta +" e seu saldo "+"R$ "+ saldo +" já está disponível para saque.");
         System.out.println("********************************************************************************************************************************************************");
    }
}
