public class FinalStudyGuide {
    public static void main(String[] args) {
        System.out.println(false && true);

        System.out.println(3 == 1);

        System.out.println(3f + 5);

        System.out.println("String Methods:");
        String a = "hello ";
        String b = "world";
        String c = "hello world";

        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));
        System.out.println((a + b).equals(c));

        System.out.println("Evaluate expression: 6 + 1 >= 10 || 20 - 10 < 7");
        System.out.println(6 + 1 >= 10 || 20 - 10 < 7);

        String str1 = "applebananabread";
        String str2 = "azzle";
        String str3 = "Apple";
        String str4 = "apple";

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println("str1 comes before str2\n" + result);
        } else if (result > 0) {
            System.out.println("str1 comes after str2\n" + result);
        } else {
            System.out.println("str1 and str2 are equal\n" + result);
        }

        System.out.println("str3.equals(str4):");
        System.out.println(str3.equals(str4));

        String s = "Red and Blue are my favorite colors.";
        System.out.println(s.indexOf("a"));

        System.out.println("String s2 length:");
        String s2 = "7 birds and 12 cats";
        System.out.println(s2.length());

        
    }
}
