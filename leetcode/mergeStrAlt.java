package leetcode;



public class mergeStrAlt {
    public static void main(String[] args) {
        mergeStrAlt obj = new mergeStrAlt();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(obj.mergeAlternately(word1, word2));
    }


    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
    
        char[] resultArr = new char[length1 + length2];
    
        int p1 = 0, p2 = 0, resultPoint = 0;
    
        String ans = word1;
    
        while (p1 < length1 || p2 < length2) {
            if (p1 < length1) {
                resultArr[resultPoint++] = word1.charAt(p1++);
            }
            if (p2 < length2) {
                resultArr[resultPoint++] = word2.charAt(p2++);
            }
        }
    
        return String.valueOf(resultArr);
    }
}
