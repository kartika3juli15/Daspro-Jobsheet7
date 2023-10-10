import java.util.Scanner;

public class WhileGaji17{
    public static void main(String[] args){
        Scanner scan17 = new Scanner (System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String Jabatan;

        System.out.print("masukkan jumlah karyawan: ");
        jumlahKaryawan = scan17.nextInt();

        int i = 0;

        while (i < jumlahKaryawan){
            System.out.println("pilihan jabatan - direktur, manager, karyawan");
            System.out.print("masukkan jabatan karyawan ke-" + (i+1) + ": " );
            Jabatan = scan17.next();
            System.out.print("masukkan jumlah jam lembur: ");
            jumlahJamLembur = scan17.nextInt();
            

            if (Jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (Jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (Jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur= jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;

            i++;
        }
        System.out.println("total gaji lembur: " + totalGajiLembur);

     }
}
     