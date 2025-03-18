public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume = volume -1;
        volume--;
    }
}
