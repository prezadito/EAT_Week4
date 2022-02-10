package homework;

public class ReverseString {

    public String reverseString(String str) {
        String rs = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rs += str.charAt(i);
        }
        return rs;
    }
}
