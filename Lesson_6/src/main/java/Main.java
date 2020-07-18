public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.running(200);
        cat.swimming(200);
        cat.bounce(200);
        Animal dog = new Dog();
        dog.running(200);
        dog.swimming(200);
        dog.bounce(0.51);
    }
}
