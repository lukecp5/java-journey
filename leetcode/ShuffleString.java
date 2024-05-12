public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] answer = new char[s.length()];
        char[] ls = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            answer[indices[i]] = ls[i];
        }

        return new String(answer);
    }
}
