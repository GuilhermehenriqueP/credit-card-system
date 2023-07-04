import java.lang.reflect.Array;
import java.util.ArrayList;

public class SelectSort {


    public SelectSort(){

    }

    public static int buscaMenor(ArrayList<Integer> list){
        int menor = list.get(0);
        int menorIndice = 0;
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < menor){
                menor = list.get(i);
                menorIndice = i;

            }

        }
        return menorIndice;
    }


    public static ArrayList<Integer> orderArray(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++){
            int menor = buscaMenor(list);
            newList.add(list.remove(menor));
        }
        return newList;
    }

}
