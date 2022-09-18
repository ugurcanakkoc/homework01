package homework;

public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        float num = 1;
        boolean asalMi=true;
        if (num != 2) {
            for (float i = 2; i < num; i++) {
                Float kalan = num % i;
                if (kalan == 0&& asalMi==true) {
                    asalMi = false;
                    break;
                } else {
                    asalMi = true;
                }
            }
        } else {
            asalMi = true;
        }
        if (asalMi==true) {
            System.out.println("Sayı asaldır!");
        } else {
            System.out.println("Sayı asal değildir!");
        }

    }
}
