package homework;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi=28;
        int toplam=0;
        for (int i = 1; i < sayi; i++) {
            if(sayi%i==0){
                toplam=toplam+i;
            }

        }
        if(toplam==sayi){
            System.out.println("Sayı mükemmel sayıdır!");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir!");
        }
    }
}
