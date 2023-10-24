import java.util.Scanner;

public class ArrayRataNilai04{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    double total = 0;
    double rata2;
    double rata2lulus, rata2tdklulus, totallulus = 0, totaltdklulus = 0;
    int jumlahlulus = 0, jumlahtdklulus = 0, jumlahmhs;


    System.out.println("Masukan jumlah mahasiswa :");
    jumlahmhs = input.nextInt();
    int[] nilaimhs = new int[jumlahmhs];

    for (int i = 0; i < nilaimhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaimhs[i] = input.nextInt();
    }
    for (int i = 0; i<nilaimhs.length; i++){
        System.out.println("Nilai Mahasiswa ke-" + i + " : " +nilaimhs[i]);
    }
    for (int i = 0; i < nilaimhs.length; i++) {
    if (nilaimhs[i] > 70){
        System.out.println("Mahasiswa ke-" + i + "lulus!" );
        jumlahlulus++;
        totallulus += nilaimhs[i];
    } else {
        System.out.println("Mahasiswa ke-" +i+ "tidak lulus!" );
        jumlahtdklulus++;
        totaltdklulus += nilaimhs[i];
    }
    }
    for (int i = 0; i<nilaimhs.length; i++){
        total += nilaimhs[i];
    }
    rata2 = total/nilaimhs.length;
    rata2lulus = totallulus/jumlahlulus;
    rata2tdklulus = totaltdklulus/jumlahtdklulus;
    System.out.println("Jumlah mahasiswa yang lulus :" + jumlahlulus);
    System.out.println("Jumlah mahasiswa yang tidak lulus :" + jumlahtdklulus);
    System.out.println("Rata-rata = " + rata2);
    System.out.println("Rata-rata nilai mahasiswa lulus :" +rata2lulus);
    System.out.println("Rata-rata niali mahasiswa tidak lulus :" + rata2tdklulus);
    }
}