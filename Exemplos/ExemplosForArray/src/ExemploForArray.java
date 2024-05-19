import java.util.Locale;
import java.util.Scanner;


public class ExemploForArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String alunos [] = {"Everton","Jheniffer","Silva","Pereira"};

        System.out.println("Digite um nome : ");
         alunos[0] =scanner.next();

        for(int x = 0; x < alunos.length ; x++){

            System.out.println("O nome do Aluno"+x é "+);

        }
    }
}
