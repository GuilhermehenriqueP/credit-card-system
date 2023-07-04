import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(3);
        lista.add(5);
        lista.add(1);
        lista.add(9);


        SelectSort ss = new SelectSort();

        lista = ss.orderArray(lista);


        for(Integer n : lista){
           System.out.println(n);
        }



    }

}