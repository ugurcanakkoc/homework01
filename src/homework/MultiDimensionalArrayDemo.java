package homework;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][2];
        sehirler[0][0]="Ankara";
        sehirler[0][1]="Konya";
        sehirler[1][0]="İzmir";
        sehirler[1][1]="Muğla";
        sehirler[2][0]="Antalya";
        sehirler[2][1]="Mersin";


        for (int i = 0; i < 3; i++) {
            System.out.println("------------");
            for (int j = 0; j < 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
