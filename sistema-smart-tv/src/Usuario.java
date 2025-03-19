public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        
        System.out.println("Volume: " + smartTv.volume);
        //------------------------------------------------------------------------
        smartTv.ligar();
        System.out.println("Novo status da tv -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status da Tv -> Tv desligada? " + smartTv.ligada);
        //------------------------------------------------------------------------
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume da Tv: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuir volume da Tv: " + smartTv.volume);
        //-------------------------------------------------------------------------
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);
    }
}
