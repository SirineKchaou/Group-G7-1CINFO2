public class SirineKchaou {

    // Calculer la somme d’un tableau d’entiers
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int num : tableau) {
            somme += num;
        }
        return somme;
    }

    // Calculer la moyenne d’un tableau d’entiers
    public static double moyenneTableau(int[] tableau) {
        return tableau.length == 0 ? 0 : (double) sommeTableau(tableau) / tableau.length;
    }

    // Calculer la factorielle d’un nombre
    public static int factorielle(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
