package strategia;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements ISortingStrategy {

    @Override
    public List sorting(ArrayList lista) {
        int j;
        Integer a;
        for (int i = 1; i < lista.size(); i++) {
            a = (Integer) lista.get(i);
            j = i - 1;
            while (j >= 0 && (Integer) lista.get(j) > a) {
                lista.set(j + 1, lista.get(j));
                --j;
            }
            lista.set(j + 1, a);
        }
        return lista;
    }
}
