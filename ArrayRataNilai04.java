import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");

        int n = input.nextInt();
        int nilaiMhs[] = new int[n];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus = 0;
        double rata2TidakLulus;
        int jmlLulus = 0;
        int jmlTidakLulus= 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totalLulus/ jmlLulus;
        rata2TidakLulus = totalTidakLulus / jmlTidakLulus;
        System.out.println("Rata-rata nilai Lulus= " + rata2Lulus);
        System.out.println("Rata-rata nilai Tidak Lulus = " +rata2TidakLulus);
    
    }
}
