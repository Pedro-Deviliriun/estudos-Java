import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String name = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sname = scanner.next();

        System.out.println("Digite a sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Seu nome completo é " + name);
        System.out.println(" " + sname+".");
        System.out.println("E sua idade é " + age + " anos,");
        System.out.println("Sua altura é : " + altura);
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }       
    }

