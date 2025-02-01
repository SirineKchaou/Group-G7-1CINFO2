import java.util.Arrays;

public class NourKerkeni {
    // Vérifier si une chaîne est un palindrome
    public static boolean estPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reverse);
    }

    // Rechercher l’élément maximal dans un tableau
    public static int maxTableau(int[] tableau) {
        int max = tableau[0];
        for (int num : tableau) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Concaténer deux tableaux
    public static int[] concatenerTableaux(int[] t1, int[] t2) {
        int[] result = new int[t1.length + t2.length];
        System.arraycopy(t1, 0, result, 0, t1.length);
        System.arraycopy(t2, 0, result, t1.length, t2.length);
        return result;
    }
}
