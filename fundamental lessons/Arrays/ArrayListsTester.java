import java.util.ArrayList;

public class ArrayListsTester {

    public static void main(String[] args) {

        ArrayList<String> animals = ArrayLists.createList();
        System.out.println(animals);

        ArrayLists.showIndex(animals);

        int index = ArrayLists.findIndex(animals, "blobfish");
        System.out.println(index);

        ArrayLists.modifyAnimals(animals);

        ArrayLists.numberUtilities();

    }

    /* ===== CHECKPOINT 2: Traversal Algorithms =====
     * CHALLENGE:
     * Find the INDEX of the max, not just its value. (Why can't you use an enhanced for loop?)
     * Example: [3, 7, 1, 9, 4]  ->  3   (the 9 is at index 3)
     * Tools:   for loop with index i, size(), get(i), a variable to remember the best index
     * */

}
