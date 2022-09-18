package homework;

public class StringsDemo {
    public static void main(String[] args) {
        String metin = "Bugün günlerden pazar.";
        System.out.println(metin);
        System.out.println("3. eleman :" + metin.charAt(2));
        System.out.println("Eleman sayısı :" + metin.length());
        System.out.println(metin.concat(" Yarın okul var."));
        System.out.println(metin.startsWith("B"));
        System.out.println(metin.endsWith("a"));
        char[] karakterler = new char[8];
        metin.getChars(0, 7, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(metin.indexOf("ün"));
        System.out.println(metin.lastIndexOf("rd"));
    }
}
