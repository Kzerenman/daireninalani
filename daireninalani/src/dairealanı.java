import java.util.Scanner;

public class dairealanı {
    public static void main(String[] args) {
        int r,merkezAci;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("DAİRENİN YARI ÇAPINI GİRİNİZ : ");
        r = inp.nextInt();

         System.out.print("MERKEZ AÇI ÖLÇÜSÜNÜ GİRİNİZ : ");

         merkezAci =inp.nextInt();

        double dda = (pi * (r * r) *merkezAci )/ 360;
         System.out.print("DAİRE DİLİM ALANI : " + dda);



    }
}
