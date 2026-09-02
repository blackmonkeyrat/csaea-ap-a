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

        boolean e = false; boolean f = true;

        // predict output: true or false?

        System.out.println(!e); // true
        System.out.println(e && f); // false
        System.out.println(e || f); // true
        System.out.println(e || f && !e); // true

        System.out.println(e && f); // short circuits after checking e - java does not need to check f since e is already false
        
    }
}