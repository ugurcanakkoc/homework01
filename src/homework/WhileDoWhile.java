package homework;

public class WhileDoWhile {
    public static void main(String[] args) {
        //while
        int i=1;
        while (i<13) {
            System.out.println(i);
            i++;
            
        }
        System.out.println("While döngüsü tamamlandı!");
        //do-while
        int j=1;
        do {
            System.out.println(j);
            j++;
            
        } while (j<13);
        System.out.println("Do-While döngüsü tamamlandı!");
    }
    
}
