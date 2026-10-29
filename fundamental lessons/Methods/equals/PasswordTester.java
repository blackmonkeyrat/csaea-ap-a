public class PasswordTester {
    public static void main(String[] args) {

        String a = "lion";
        String b = new String("lion");
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(a == b);
        System.out.println(a.equals(b));

        String cut = "dandelion".substring(5);
        System.out.println(cut);
        System.out.println(cut == a);
        System.out.println(cut.equals(a));

        String c = "lion";
        System.out.println(a == c); //true because compares same object

        int x = 5;
        int y = 5;

        System.out.println(x == y);

        Password p = new Password("lion");
        String attempt = new String("lion");
        System.out.println(p.checkBroken(attempt));
        System.out.println(p.check(attempt));

        Password p2 = new Password("lion");
        System.out.println(p.sameAs(p2.secret));

        System.out.println(p.change("tiger", "tiger"));

    }
}
