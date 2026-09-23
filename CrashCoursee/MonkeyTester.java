public class MonkeyTester {
    
    public static void main(String[] args) {

Monkey bob = new Monkey("Bob", "Spider Monkey", "Male");
Monkey max = new Monkey("Max", "Capuchin", "Male");
Monkey sarah = new Monkey("Sarah", "Howler Monkey", "Female");
Monkey jeff = new Monkey("Jeff", "Capuchin", "Male");
Monkey julia = new Monkey("Julia", "Spider Monkey", "Female");

jeff.eat(3);
julia.run();
sarah.drink();
max.climb();
bob.birthday();

    }
}

