import java.util.ArrayList;

public class CrashCourse {
    public static void main(String[] args) {
        
        // comments

        /*
        Multiline
        Comment
        */

        System.out.print("Hello");
        System.out.println("World"); //autoprints on a new line
        System.out.println("Hello World");

        // variable declerations:
        // PRIMITIVE VARIABLES
        int a; // integer
        double b; // decimal/float
        boolean c; // true or false

        a = 4;
        b = 5.5;
        c = false; // lowercase

        // Arithmetic Operators
        // + - / * %
        // += -= /= %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // Increment and decrement by one
        // -- ++

        d--;
        d++;
        d++;
        System.out.println("d = " + d);

        //COMPARISONS (always returns true or false)
        // < > <= >= == !=

        System.out.println(4 < 5);
        System.out.println(74 == 5);
        System.out.println(1 < 5);

        // LOGICAL OPERATORS
        // In order of presidence: NOT: ! AND: && OR: ||

        boolean f = false; boolean t = true;

        // predict output: true or false?

        System.out.println(!f); // true
        System.out.println(f && t); // false
        System.out.println(f || t); // true
        System.out.println(f || t && !f); // true

        System.out.println(f && t); // short circuits after checking e - java does not need to check f since e is already false
        System.out.println(t || f && t); //short circuits after checking the first t.

        // CASTING (converting)

        int g = (int)5.5;
        System.out.println(g);

        double h = (double)5/6;
        System.out.println(h);

        // STRINGS

        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "goodbye";
        String result = s1 + s2 + s3;
        result += ", cowboy.";
        System.out.println(result + "\n");

        // ARRAYS

        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

            arry1[0] = 11;
            arry1[1] = 2;

            System.out.println("remainder: " + arry1[0] % arry1[1]);

            int[] arry2 = {34, 52, 3, 64, 32};
            System.out.println("arry2: " + arry2);

            // 2D ARRAYS (grid or table)

            int[][] arryGrid1 = new int[4][3]; // [rows][columns]
            // 0 0 0
            // 0 0 0
            // 0 0 0
            // 0 0 0

            System.out.println("Rows: " + arryGrid1.length);
            System.out.println("Columns: " + arryGrid1[0].length);

            int[][] arrygrid2 = {{7,8,9}, {4,5,6}, {1,2,3}};
            System.out.println(arrygrid2[0][1]); // Access #8
            System.out.println(arrygrid2[2][2]); // Access #3

            // ARRAYLISTS
            // Can be any size, lots of built in functions to help.
            // Avoid primitive data types. Special classes for Integer, Double, Boolean, String. Called "wrapper classes."

            ArrayList<String> arryLst = new ArrayList<>();
            
            arryLst.add("Word 1");
            arryLst.add("Word 2");
            arryLst.add("Word 3");
            arryLst.remove(0);
            arryLst.add(0, "Word 4");
            arryLst.set(2, "Word 5");

            System.out.println(arryLst);
            System.out.println(arryLst.size());
            System.out.println(arryLst.get(2));

    }
}