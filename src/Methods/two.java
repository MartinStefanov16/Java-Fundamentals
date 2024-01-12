package Methods;

public class two {
    public static void main(String[] args) {

        sayHello("marto");

        String newName = "Ivan";
        sayHello(newName);

    }

    public static void sayHello(String name) {
        System.out.printf("Hello %s!\n", name);
    }


}
