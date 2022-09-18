package homework;

public class RecapDemo01 {

	public static void main(String[] args) {
		int sayi1, sayi2, sayi3,enBuyuk;
		String mesaj = " en büyük sayıdır!";
		sayi1 = 1;
		sayi2 = 20;
		sayi3 = 3;
		enBuyuk=sayi1;
		if(enBuyuk<sayi2){
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3){
			enBuyuk=sayi3;
		}
		System.out.println(enBuyuk + mesaj);

	}

}
