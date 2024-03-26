package archive;
class Driver {
    public static void main(String[] args) {
        int a = bar(2);
        int b = foo(a);
    }

    static int foo(int a) {
        System.out.print(a);
        a = bar(a + 1);
        return a;
    }

    static int bar(int a) {
        System.out.print(a);
        return a + 2;
    }
}

class Driver {
    public static void main(String[] args) {
        foo(3);
        bar(3);
    }

    static void foo(int a) {
        bar(a - 1);
        System.out.print(a);
    }

    static void bar(int a) {
        System.out.print(a);
    }
}