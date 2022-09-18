package homework;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Uğur";
        ogrenciler[1] = "Can";
        ogrenciler[2] = "Ada";
        ogrenciler[3] = "Melis";

        // Version 1
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("------------------------");
        // Version2
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}
