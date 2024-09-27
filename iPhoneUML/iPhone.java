public class iPhone implements AparelhoTelefonico, navegadorInternet, reprodutormusical {

    public void ligar(){
        System.out.println("Você está fazendo uma ligação.");
    }
    public void atender(){
        System.out.println("Você atendeu uma ligação.");
    }
    public void correioVoz(){
        System.out.println("Você tem uma mensagem gravada.");
    }
    public void exibirPagina(){
        System.out.println("Você está exibindo uma página.");
    }
    public void adicionarNovaAba(){
        System.out.println("Você adicionou uma nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Você atualizou a página.");
    }
    public void tocar(){
        System.out.println("Você está tocando uma música.");
    }
    public void pausar(){
        System.out.println("Você pausou uma música.");
    }
    public void selecionarMusica(){
        System.out.println("Você selecionou uma música nova.");
    }
}
