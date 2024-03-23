public class Mia {
    public static void reverseMia(String inputString) {
        int lastChar = 0;

        lastChar = inputString.length() - 1;

        for (int i = lastChar; i >= 0; --i) {

            if (i != 0) {

                System.out.print(inputString.charAt(i) + "/");

            } else {

                System.out.print(inputString.charAt(i));

            }

        }
    }

    public static void main(String[] args) {
        reverseMia("Mia");
    }
}
