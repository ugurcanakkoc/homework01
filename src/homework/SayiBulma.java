package homework;

public class SayiBulma {

    public static void main(String[] args) {
        int sayi = 100;
        int[] sayilar = { 14, 6, 2, 8, 34, 17, 53, 3, 9, 54, 38, 10 };

        for (int x : sayilar) {
            if (sayi == x) {
                System.out.println("Sayı listede vardır.");
                return;
            }
            
        }
        System.out.println("Sayı listede yoktur.");
    }

}