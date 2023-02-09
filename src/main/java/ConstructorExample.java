
public class ConstructorExample {

    public static void main(StringExample[] args) {
        User u = new User();

//        foo2();
    }

    public static void foo() { // Reduksiya Prosesi   Recursion Process
        System.out.println("foo");
        foo();  // Infinite Recursion
    }

    public static void foo2() {
        foo3();//pause
        System.out.println("foo2");
    }

    public static void foo3() {
        foo4();//pause
        System.out.println("foo3");
    }

    public static void foo4() {
        System.out.println("foo4");

    }

}
