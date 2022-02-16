package homework;

import java.util.*;

public class ArrayWork {

    public static void main(String[] args) {

        // Arrays declaration and assignment
        int[] array1 = { 1, 3, 2, 4, 8, 9, 0 };
        int[] array2 = { 1, 3, 7, 5, 4, 0, 7, 5 };

        // ArrayLists declaration and assignment
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for (int i : array1) {
            ls1.add(i);
        }
        for (int i : array2) {
            ls2.add(i);
        }
        System.out.println("List One:");
        System.out.println(ls1);
        System.out.println("List Two:");
        System.out.println(ls2);

        // HashSets declaration and assignment
        Set<Integer> hs1 = new HashSet<>(ls1);
        Set<Integer> hs2 = new HashSet<>(ls2);

        // Union of hs1 and hs2
        Set<Integer> hs3 = new HashSet<Integer>();
        hs3.addAll(hs1);
        hs3.addAll(hs2);
        System.out.println("Union:");
        System.out.println(hs3);

        // Intersection of hs1 and hs2
        Set<Integer> hs4 = new HashSet<Integer>();
        hs4 = hs1;
        hs4.retainAll(hs2);
        System.out.println("Intersection:");
        System.out.println(hs4);

        // Symmetric difference (union minus intersection) of hs1 and hs2
        Set<Integer> hs5 = new HashSet<Integer>();






    }



}
