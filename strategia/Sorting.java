package strategia;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    private ISortingStrategy strategy;

    public Sorting(ISortingStrategy sortingStrategy) {
        this.strategy = sortingStrategy;
    }

    public List<Integer> executeStrategy(ArrayList<Integer> lista) {

        return strategy.sorting(lista);
    }
}
