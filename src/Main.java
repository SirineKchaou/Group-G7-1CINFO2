import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {3, 5, 8, 2, 9};
        int[] tableau2 = {10, 20, 30};



        System.out.println("\n===> Test avec Nour Kerkeni <===");
        System.out.println("'radar' est un palindrome ? " + NourKerkeni.estPalindrome("radar"));
        System.out.println("Max du tableau : " + NourKerkeni.maxTableau(tableau));
        System.out.println("Concaténation : " + Arrays.toString(NourKerkeni.concatenerTableaux(tableau, tableau2)));


    }
}
