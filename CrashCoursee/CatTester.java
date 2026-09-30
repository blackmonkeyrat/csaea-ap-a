public class CatTester {
    
    public static void main(String[] args) {
        Cat bob = new Cat("Bob", "Tabby", "Male");
        Cat sara = new Cat("Sara", "Siamese", "Female");

        bob.getName();
        sara.setName("Alexa");
        bob.getWeight();
        sara.getBreed();
        // so what?
        String catName = bob.getName();
        System.out.println("From Tester Class: " + catName);
        System.out.println("Hi " + bob.getName());

        bob.eat(5);
        sara.runAway(3);
        bob.drink();
        sara.climb();
        bob.birthday();
    }
}
