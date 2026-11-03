//TESTER CLASS: Seperate class, holds main.

public class RobotTester {
    public static void main(String[] args) {

        //OBJECT: Specific instance of a class.
        //INSTANTIATION: New + constructor call.
        //ARGUMENTS: "Rover", "RX-77-B", 8.0.
        Robot r1 = new Robot("Rover", "RX-77-B", 8.0);
        Robot r2 = new Robot("Rover", "RX-77-B", 8.0);

        System.out.println(r1); // returns?

        //ALIASING
        Robot r3 = r1;
        System.out.println(r3); // returns?

        r3.setName("Scout");

        System.out.println(r1.getname());

        //== compares objects.
        System.out.println(r1 == r3);
        System.out.println(r1 == r2);

        //== vs. .equals() on Strings.
        String s1 = "RX-77-B";
        String s2 = new String("RX-77-B");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(r1.serialContains("77"));
        

    }
    
}
