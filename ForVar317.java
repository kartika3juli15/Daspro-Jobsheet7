import java.util.Scanner;

public class ForVar317 {
    public static void main(String[] args) {
        Scanner sc17= new Scanner(System.in);

        int bil, i;
        boolean berhenti = false;

        for (i = 0; !berhenti; i++) {
            System.out.print("Masukkan bilangan : ");
            bil = sc17.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);

            if (bil < n) {
                berhenti = true;
            }
        }
        System.out.println("sudah selesai");
    }

}