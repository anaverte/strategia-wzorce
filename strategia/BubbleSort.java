package strategia;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements ISortingStrategy {

    @Override
    public List sorting(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 1; j < (lista.size() - i); j++) {
                Integer a = (Integer) lista.get(j - 1);
                Integer b = (Integer) lista.get(j);
                if (a > b) {
                    lista.set(j - 1, b);
                    lista.set(j, a);
                }
            }
        }
        return lista;
    }

}
