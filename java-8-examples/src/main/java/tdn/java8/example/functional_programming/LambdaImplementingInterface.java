package tdn.java8.example.functional_programming;

public class LambdaImplementingInterface {

    // Define functional interface
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {

        // Implement functional interface via anonymous class
        Greeting g1 = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        g1.sayHello();

        // Implement functional interface via lambda expression
        Greeting g2 = () -> System.out.println("Hello from lambda");
        g2.sayHello();
    }
}