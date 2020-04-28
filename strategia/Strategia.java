package strategia;

import java.util.ArrayList;
import java.util.Scanner;

public class Strategia {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        Sorting sortowanie;
        do {
            System.out.println("Proszę wybrać zadanie do wykonania.");
            System.out.println("1) Dodaj element do listy.");
            System.out.println("2) Sortuj bąbelkowo.");
            System.out.println("3) Sortuj przez wstawianie.");
            System.out.println("4) Sortuj przez scalanie.");
            System.out.println("5) Wyjście.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Dodawana wartość to:");
                    lista.add(scanner.nextInt());
                    break;
                case 2:
                    sortowanie = new Sorting(new BubbleSort());
                    sortowanie.executeStrategy(lista);
                    for (int i : lista) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    sortowanie = new Sorting(new InsertionSort());
                    sortowanie.executeStrategy(lista);
                    for (int i : lista) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 4:
                    sortowanie = new Sorting(new MergeSort());
                    sortowanie.executeStrategy(lista);
                    for (int i : lista) {
                        System.out.print(i + " ");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Koniec.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Podano nieprawidłową wartość.\n Proszę wybrać ponownie.");
            }
        } while (choice != 5);
    }
}
