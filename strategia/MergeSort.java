package strategia;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements ISortingStrategy {

    ArrayList<Integer> temp = new ArrayList<>();

    @Override
    public List sorting(ArrayList lista) {
        while (temp.size() < lista.size()) {
            temp.add(0);
        }
        sortuj(lista, 0, lista.size() - 1);
        return lista;
    }

    private void scal(ArrayList lista, int left, int right, int middle) {
        int i, j;
        for (i = middle + 1; i > left; i--) {
            temp.set(i - 1, (Integer) lista.get(i - 1));
        }
        for (j = middle; j < right; j++) {
            temp.set(right + middle - j, (Integer) lista.get(j + 1));
        }
        for (int k = left; k <= right; k++) {
            if (temp.get(j) < temp.get(i)) {
                lista.set(k, temp.get(j--));
            } else {
                lista.set(k, temp.get(i++));
            }
        }
    }

    private void sortuj(ArrayList lista, int left, int right) {
        if (right <= left) {
            return;
        }
        int middle = (left + right) / 2;
        sortuj(lista, left, middle);
        sortuj(lista, middle + 1, right);
        scal(lista, left, right, middle);

    }
}
