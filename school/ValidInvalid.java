package school;
public class ValidInvalid {
    public static void main(String[] args) {
        String keyString = "C2c57BF";
        boolean goodPasswd = keyString.length() <= 7 && countLetters(keyString) <= 4;

        if (goodPasswd) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static int countLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
