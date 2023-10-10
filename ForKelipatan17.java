import java.util.Scanner;

public class ForKelipatan17{
     public static void main(String[] args){
        Scanner scan17 = new Scanner (System.in);

    int kelipatan, jumlah=0, counter=0;
    double rataRata;

    System.out.print("masukkan bilangan kelipatan (1-9): ");
    kelipatan = scan17.nextInt();

    for (int i = 1; i <=50; i++) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;

    System.out.printf("banyaknya blangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",  kelipatan, jumlah);
            }
        }

     }
}
   