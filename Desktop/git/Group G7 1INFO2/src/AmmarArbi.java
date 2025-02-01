public class AmmarArbi {
    // Vérifier si un nombre est pair
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    // Vérifier si un nombre est premier
    public static boolean estPremier(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Inverser une chaîne de caractères
    public static String inverserChaine(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
