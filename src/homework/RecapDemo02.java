package homework;

public class RecapDemo02 {
    public static void main(String[] args) {
        double[] numList={1.3,9.7,5.3,11.1,8.4};
        double toplam=0;
        double enBuyuk=numList[0];

        for (double num:numList) {
            toplam=toplam+num;
            if(enBuyuk<num){
                enBuyuk=num;
            }
        }
        System.out.println("Sayıların toplamı: "+ toplam);
        System.out.println("En büyük sayı: "+ enBuyuk);
    }
}
