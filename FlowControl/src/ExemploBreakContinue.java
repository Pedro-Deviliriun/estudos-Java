public class ExemploBreakContinue {
    public static void main(String[] args) {

        //Break interrompe o fluxo do código totalmente, o continue apenas pula a etapa que está sendo executada para a próxima.
        
        for (int numero = 1; numero <=5; numero ++){
            if(numero==3){
                continue;
            }
            System.out.println(numero);
        }
    }
}
