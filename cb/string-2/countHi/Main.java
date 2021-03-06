// https://codingbat.com/prob/p147448

public class Main {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
    }

    /*
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     */
    public static int countHi(String str) {
      int hiCounter = 0;
      for (int i = 0; i < str.length(); i++){
        if (i + 2 <= str.length()){
          if (((str.substring(i, i+2)).equals("hi"))){
            hiCounter++;
          }
        }
      }
      return hiCounter;
    }
}
