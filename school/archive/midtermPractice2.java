package school.archive;
import java.util.*;

public class midtermPractice2 {
    public static void main(String[] args){
        System.out.println("Hello World".getClass().getSimpleName());
        System.out.println(((Float) (7.0f / 3f)).getClass());
 
        String s = "Apples and bananas are yummy.";
        System.out.println("s: " + s);

        System.out.println("s.substring(1, 3): " + s.substring(1, 3));

        String s2 = "Apples and bananas are yummy.";
        System.out.println("s: " + s2);

        System.out.println("s.substring(2, 4): " + s2.substring(2, 4));
    }
}
