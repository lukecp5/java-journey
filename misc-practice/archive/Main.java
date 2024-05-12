class Main {
    private static void foo() {
        int x = 11;
        System.out.println(x);
    }

    private static int x = 5;

    public static void main(String[] args) {
        foo();
        System.out.println(x);
    }
}