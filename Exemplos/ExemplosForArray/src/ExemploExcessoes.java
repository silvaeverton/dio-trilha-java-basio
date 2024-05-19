import java.util.Locale;
import java.util.Scanner;

public class ExemploExcessoes {

    public static void main(String[] args) {
        
    try{    
    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

    
        System.out.println ("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println ("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade :");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura :");
        double altura = scanner.nextDouble();

        System.out.println(nome+" "+sobrenome);
        System.out.println(idade);
        System.out.println(altura);

     }catch (java.util.InputMismatchException e){
        System.err.println("A altura e a idade deve ser inserida de forma numerica ");
        
     }


   }
 }


