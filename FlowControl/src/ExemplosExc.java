import java.text.NumberFormat;
import java.text.ParseException;

public class ExemplosExc {
    public static void main(String[] args) {
        Number valor = Double.valueOf("al.75");

        try {
            valor = NumberFormat.getInstance().parse("al.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }   
}

