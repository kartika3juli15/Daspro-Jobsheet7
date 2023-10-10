import java.util.Scanner;

public class DoWhileCuti17_2 {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = sc17.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc17.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = s17.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                }else {
                    System.out.println("Jatah cuti tidak tersedia, sisa jatah cuti anda tinggal " + jatahCuti);
                }
            } else {
                break;
            }
        } while (jatahCuti>0);
    }
}
