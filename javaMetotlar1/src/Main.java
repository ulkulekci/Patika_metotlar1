import java.util.Scanner;
public class Main { static void metot(int sayi)
  {
        { int  kalan, polindrom, i=0;
            polindrom=sayi;
                while (sayi!=0){
                    kalan=sayi%10;
            i=(i*10+kalan);
              sayi=sayi/10;}
            if (polindrom==i)
            {System.out.println("sayi palindrom");}
            else {
                System.out.println("sayi palindrom degil");}}
        }
    public static void main(String[] args) {
        int a=1;
        while (a==1){
        Scanner input = new Scanner(System.in);
        System.out.print("sayi gir:");
        int sayi = input.nextInt();
        metot(sayi);}


    }
}

