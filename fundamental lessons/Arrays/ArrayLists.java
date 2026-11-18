import java.util.ArrayList;

public class ArrayLists {
    
    public static ArrayList<String> createList() {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("donkey");
        animals.add("pangolin");
        animals.add("blobfish");

        return animals;

    }

    public static void showIndex(ArrayList<String> animals) {

        System.out.println("First Element: " + animals.get(0));
        System.out.println("Second Element: " + animals.get(1));
        System.out.println("Last Element: " + animals.get(animals.size() - 1));

    }

    // linear search: returns the index of target, or -1 if not found
    // -1 is a signal value meaning "not found," never a real index

    public static int findIndex(ArrayList<String> list, String target) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(target)) {

                return i;

            }

        }

        return -1;

    }

}
