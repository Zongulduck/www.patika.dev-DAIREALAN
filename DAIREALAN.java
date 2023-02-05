import java.util.Scanner;
public class DAIREALAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("/Daire diliminın alanını bulma programı/");
        System.out.println("Yarıçap giriniz; ");
        a= input.nextDouble();
        System.out.println("Merkez açı giriniz; ");
        b= input.nextDouble();
        c=(3.14*(a*a)*b)/360;
        System.out.println("Daire diliminin alanı; ");
        System.out.println(c);
    }
}
