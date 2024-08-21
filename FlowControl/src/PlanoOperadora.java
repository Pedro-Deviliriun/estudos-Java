public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "T";

        //O switch case pode ser usado para evitar repetição de métodos em sistemas muito complexos de else if
        switch(plano) {
            case "T":{
                System.out.println("5GB de youtube");
            }
            case "M":{ 
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 Minutos de ligação");
            }
        }
    }
    
}
