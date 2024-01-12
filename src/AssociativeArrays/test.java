package AssociativeArrays;

public class test {
    public static void main(String[] args) {
        int n = 10;
        int n2 = 2;
        doThing(n,n2);
        System.out.println(n);
    }

    public static void doThing(Integer n, Integer n2) {
        n = n -n2;
    }
}
