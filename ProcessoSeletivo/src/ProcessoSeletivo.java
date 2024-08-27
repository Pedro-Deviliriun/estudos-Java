import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;

public class ProcessoSeletivo {

    static String [] candidatos = {"Joao", "Bruno", "Bruna", "Guilherme", "Beatriz", "Alberto", " Kaike", "Marlon", "Clarrise", "Bianca", "Sagava", "Wellington"};
    static ArrayList<String> candidatosEscolhidos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        System.out.println("Processo Seletivo!");
        selecaoCandidato();
        imprimirSelecionados();

        for (String candidato : candidatosEscolhidos){
            entrandoEmContato(candidato);
        }

    }

    static void imprimirSelecionados(){
        for (int i = 0; i < candidatosEscolhidos.size(); i++){
            System.out.println("O candidato escolhido é: " + candidatosEscolhidos.get(i));
        }
    }

    public static void selecaoCandidato(){

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido){
                System.out.println("Candidato " + candidato + " foi selecionado.");
                candidatosEscolhidos.add(candidato);
                candidatosSelecionados++;
            } 
            candidatoAtual++;
        }
        
    }

    static void analisarCandidato(Double salarioPretendido){
        double salarioBase = 2000.00;

        if (salarioPretendido < salarioBase){

            System.out.println("Ligar para o candidato.");

        } else if (salarioPretendido > salarioBase) {

            System.out.println("Enviar contraproposta para o candidato");

        }else{

            System.out.println("Aguardando demais candidatos.");
        
        }
    }

    static Double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizas = 1;
        boolean atendeu = false;
        boolean continuarLigando = true;

        do{
            atendeu = atender();
            continuarLigando = !atendeu;

            if(continuarLigando){
                tentativasRealizas++;
            }

        } while (continuarLigando && tentativasRealizas < 3);{
            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato);
            }else{
                System.out.println("Não conseguimos contato com o " + candidato);
            }
        }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
