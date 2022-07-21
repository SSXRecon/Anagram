public class Anagram {

    public static void main(String[] args) {
        System.out.println(checkAnagram("ran", "ran"));
    }

    public static boolean checkAnagram(String a, String b) {
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        boolean match = true;
        int i = 0;

        do  {

            for (char j : charB) {
                if (i == j) {
                    match = true;
            }
            i++;

        } while (match);


        if (!match) {
            return false;
        } else {
            return true;
        }
    }
}
