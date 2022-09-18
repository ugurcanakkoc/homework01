package homework;

public class SwitchDemo {
    public static void main(String[] args) {
        char harf = 'd';

        switch (harf) {
            case 'A':
                System.out.println("Başarılı");
                break;
            case 'B':
                System.out.println("Orta");
                break;
            case 'C':
                System.out.println("Başarısız");
                break;

            default:
                System.out.println("Geçersiz giriş");
                break;
        }
    }
}
