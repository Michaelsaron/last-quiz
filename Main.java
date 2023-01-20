package exercise.com;

public abstract class Main {
void animals() {
        System.out.println("all are animals");
    }
    abstract void run();

    public static void main(String[] args) {
        System.out.println("Hello world!");
      // Main Lion = new Main();
        // question number 2 we cannot instantiate object for abstract class.
Fox f=new Fox();
f.animals();
f.eat();
f.sound();
f.run();

    }

}
