public class SmartTV {

    boolean ligado = false;
    int canal = 0;
    int volume = 50;
    

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }

    public void definirVolume(int n){
        volume = n;        
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mutar(){
        volume = 0;
    }

    public void mudarCanal(int cnl){
        canal = cnl;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}
