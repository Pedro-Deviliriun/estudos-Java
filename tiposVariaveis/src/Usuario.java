import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SmartTV SmartTV = new SmartTV();
        
        System.out.println("TV ligada? " + SmartTV.ligado);
        System.out.println("Canal atual: " + SmartTV.canal);
        System.out.println("Volume atual: " + SmartTV.volume);

        SmartTV.ligar();
        System.out.println("Novo Status: " + SmartTV.ligado);

        SmartTV.aumentarVolume();
        System.out.println("Volume atual: " + SmartTV.volume);

        SmartTV.definirVolume(72);
        System.out.println("Volume foi definido para: " + SmartTV.volume);



    }
    
}
