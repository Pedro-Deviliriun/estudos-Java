public class FormatadorCepExem {
    public static void main(String[] args) {

        try{

        String cepFormatado = formatarCep("1234578");

        System.out.println(cepFormatado);

        }

        catch(CepImvalidoException e){
        
            System.out.println("O CEP inserido é inválido.");
        
        }
    }   
    
    static String formatarCep(String cep) throws CepImvalidoException{
        if (cep.length() != 8 ){
            throw new CepImvalidoException();	
        }
        return "12.345-678";
    }
}
