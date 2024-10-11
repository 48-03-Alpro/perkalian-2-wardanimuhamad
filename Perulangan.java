
import java.util.Scanner;

public class Perulangan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int angka;
        int hasilAkhir = 0;
        angka  = input.nextInt();
        // Start pengerjaan soal
        hasilAkhir = angka+2;

        // End Pengerjaan soal

        input.close();
        System.out.println(hasilAkhir);

    }
}
