import java.util.ArrayList;
import java.util.List;

public class ListaEstudo{
    public static void main (String[] args){
        List<String> frutas = new ArrayList();
        frutas.add("Banana");
        frutas.add("Morango");
        frutas.add("Abacaxi");

        frutas.add(0, "Kiwi");

        frutas.get(2);

        frutas.remove("Abacaxi");

        System.out.println(frutas.size());

        System.out.println(frutas);
    }
}