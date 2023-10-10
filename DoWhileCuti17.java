import java.util.Scanner;

public class DoWhileCuti17{
    public static void main(String[] args){
        Scanner sc17 = new Scanner (System.in);
    
        int jatahCuti, jumlahHari; 
        String konfirmasi; 

        System.out.print("jatah cuti: ");
        jatahCuti= sc17.nextInt();

        do {
            System.out.print("apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc17.next();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("jumlah hari: ");
                jumlahHari = sc17.nextInt();

                if (jumlahHari<= jatahCuti){
                    jatahCuti-= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                }else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi" );
                    break;
                }
            }
             
        } while (jatahCuti> 0);

    }
}
    
