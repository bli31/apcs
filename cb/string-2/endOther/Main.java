// https://codingbat.com/prob/p126880

public class Main {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }

    /*
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
    public static boolean endOther(String a, String b) {
      String larger, smaller;
      if (a.length() > b.length()){
        larger = a;
        smaller = b;
      }
      else{
        larger = b;
        smaller = a;
      }
      larger = larger.toLowerCase();
      smaller = smaller.toLowerCase();
      int i = larger.length() - smaller.length();
      return ((larger.substring(i, larger.length())).equals(smaller));
    }
}
