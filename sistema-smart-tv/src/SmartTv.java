public class SmartTv {
    //-----------Declara variável-------------------------
    boolean ligada = false;
    int canal = 1;              
    int volume = 30;

    //-----------Ligar e Desligar a Tv--------------------

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    //------------Area do volume---------------------------

    public void aumentarVolume(){
        volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume = volume -1;
        volume--;
    }

    // -------------Area do canal-------------------------
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal = canal + 1;
        canal++;
    }

    public void diminuirCanal(){
        canal = canal -1;
        canal--;
    }
}
