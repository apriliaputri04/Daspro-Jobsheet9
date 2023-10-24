import java.util.Scanner;

public class LinearSearch04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    int[] arryInt = {34, 18, 26, 48, 72, 56, 63};
    int key;
    int hasil = 0;

    System.out.println("Masukkan jumlah elemen array :");
    int jmlelemen = input.nextInt();
    int[] arrayInt = new int[jmlelemen];
    for(int i = 0; i < arrayInt.length; i++){
        System.out.print("Masukkan element array ke-" + (i) + " :");
        arrayInt[i] = input.nextInt();
    }
    System.out.print("Masukkan key yang ingin dicari :");
    key = input.nextInt();
    for (int i = 0; i < arrayInt.length; i++){
        if (arrayInt[i] == key) {
            hasil = i;
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        }else {
            System.out.println("key tidak ditemukkan");
            break;
        }
    }
    }
}