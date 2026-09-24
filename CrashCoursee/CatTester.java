public class CatTester {
    
    public static void main(String[] args) {
        Cat bob = new Cat("Bob", "Tabby", "Male");
        Cat sara = new Cat("Sara", "Siamese", "Female");
        bob.eat(5);
        sara.runAway(3);
        bob.drink();
        sara.climb();
        bob.birthday();
    }
}
