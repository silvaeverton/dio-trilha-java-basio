public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada ?"+ smartTv.ligada);
        System.out.println("Volume Atual :"+smartTv.volume);
        System.out.println(" Canal Atual : "+smartTv.canal);

        smartTv.ligar();
        System.out.println("TV Ligada ? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV Ligada ? "+smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("TV volume Atual: "+smartTv.volume);
        smartTv.mudarCanal(18);
        System.out.println("Canal atual "+smartTv.canal);
        smartTv.desligar();
        System.out.println("TV ligada?"+smartTv.ligada);
        smartTv.mudarCanal(23);
        System.out.println("Canal atual "+smartTv.canal);
    }
}
