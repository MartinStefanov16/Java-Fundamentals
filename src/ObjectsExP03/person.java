package ObjectsExP03;

public class person {
    // fields
    private String name;
    private int age;


    // constructor who creates object

    public person (String name, int age) {
        //new obj
        this.name = name;
        this.age = age;
    }

    //methods - actions that obj can do
    //getters - methods to get value of fields
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
