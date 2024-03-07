package school.archive;
public class midtermPractice {
    public static void main(String[] args) {
        String s1 = "carrot";
        String s2 = "Carrot3";

        // Compare the lengths of s1 and s2
        System.out.println("s1 and s2 have the same length: " + (s1.length() == s2.length()));
        System.out.println(s1.length() == s2.length());

        System.out.println(s1.equals(s2));
        System.out.println("-----------------");
    
        String s = "Bananas and apples are yummy.";
        System.out.println(s.indexOf('a'));
        System.out.println("-----------------");

        String s3 = "7 birds and 12 cats";
        System.out.println(s3.length());
        System.out.println("-----------------");
        System.out.println("-----------------");

        String str = "Hello World";
        
        String substr = str.substring(0, 1);
        System.out.println("substr: " + substr);
        System.out.println(substr); // Output: "World"
    }

}
