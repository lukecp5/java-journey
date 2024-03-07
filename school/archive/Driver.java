package school.archive;

class Driver {
    public static void main(String[] args) {
        int a = bar(2);
        int b = foo(a);
        System.out.print(b);
    }

    static int foo(int a) {
        a = bar(a) - 2;
        return a;
    }

    static int bar(int a) {
        System.out.print(a);
        return a + 1;
    }
}