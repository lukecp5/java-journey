import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        // System.out.println(list);
        System.out.println("From the main method:");
        System.out.println(list);
        System.out.println("-----------------");

        System.out.println("-----------------");
        System.out.println("From the prnt method:");
        prnt(list);
        System.out.println("-----------------");

        System.out.println("list.stream().forEach((n) -> System.out.println(n));");
        list.stream().forEach((n) -> System.out.println(n + "\t|| Hashcode:" + n.hashCode()));
        System.out.println("-----------------");

        System.out.println("forEach(n) -> System.out.println(n);");
        list.forEach((n) -> System.out.println(n));
    }

    public static ArrayList<String> prnt(ArrayList<String> arg) {
        for (int i = 0; i < arg.size(); i++) {
            System.out.println(arg.hashCode() + " " + arg.get(i));
        }
        return null;
    }
}