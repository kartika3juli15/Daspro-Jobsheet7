import java.util.Scanner;

public class ForVar217 {
 public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        int bil, i;
        boolean berhenti = false;

        for (; !berhenti;) {
            System.out.print("Masukkan bilangan: ");
            bil = sc17.nextInt();
            System.out.println("Bilangan yang Anda masukkan: " + bil);
            if (bil == 0) {
                berhenti= true;
            }
        }
        System.out.println("sudah selesai");
    }
}