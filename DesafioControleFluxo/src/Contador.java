import java.util.Scanner;

/*
 * O código apresentado é um programa Java que solicita dois números ao usuário, 
 *  verifica se o segundo número é maior que o primeiro.
 *  Se for, o programa imprime uma contagem de números a partir do primeiro número até o segundo número.
 * vide README.
 */


public class Contador {
   public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo Numero:");
        int segundoNumero = scanner.nextInt();

      try { 

      comparar(primeiroNumero, segundoNumero);

      }catch (Exception ParametrosInvalidosException ){
         System.out.println("O segundo numero deve ser maior que o primeiro");


      }
         
      
   
    
   }
   static void comparar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
      //Método utilizado para verificar se o segundo numero é Maior que o primeiro.
      if (numeroDois < numeroUm){
         throw new ParametrosInvalidosException();

      
      }
      else {
      int contagem = numeroDois - numeroUm;

      for (int x=1; x <= contagem;x++){
         System.out.println("Imprimindo numero: "+x);

      }
      }
      
   }

}
