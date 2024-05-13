public class Operadores {

    public static void main(String[] args) {
        String concatenacao = "?";

        String nomeUm ="EVERTON";
        String nomeDois = new String("EVERTON");

        System.out.println(nomeUm.equals(nomeDois));
        /*equals é utilizado para comparar objetos */
        
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        
    }

}
