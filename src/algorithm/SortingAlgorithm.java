package algorithm;

public class SortingAlgorithm {

    public static void main(String[] args) {

        // Insertion

        int[] array = {6, 1, 5, 4, 8, 9, 0, 7, 3, 2};

        System.out.println("Array (before sort):");

        for (int i : array) {
            System.out.print(i);
        }

        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        System.out.println("\n" + "Sorted by Insertion:");

        for (int j : array) {
            System.out.print(j);
        }

    }




}
