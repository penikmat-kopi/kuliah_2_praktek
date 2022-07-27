package Meet_03; // hapus ini jika ada error di proses compile anda
import java.util.Scanner;

class HargaTenda {
    public int HargaSewaTendaKecil(){
        return 250000;
    }
    public int HargaSewaTendaSedang(){
        return 500000;
    }
    public int HargaSewaTendaBesar(){
        return 1000000;
    }
}

class HargaSewa extends HargaTenda {
    public int TotalHargaSewa;
    public int Sewa(int Hari, int JenisTenda){
        if (JenisTenda == 1){
            TotalHargaSewa = Hari * super.HargaSewaTendaKecil();
        }
        if (JenisTenda == 2){
            TotalHargaSewa =  Hari * super.HargaSewaTendaSedang();
        }
        if (JenisTenda == 3){
            TotalHargaSewa =  Hari * super.HargaSewaTendaBesar();
        }
        return TotalHargaSewa;
    }
}

public class Program {
    static void ErrorMassage(){
        System.out.print(
            "terjadi kesalahan input\n\n"
        );
    }

    public static void main(String[] args) {
        int InputJenis = 0, InputHari = 0, TotalHarga = 0, angka = 0;
        HargaSewa SewaTenda = new HargaSewa();

        System.out.print(
            "+------------------------------+\n"+
            "|      Program sewa Tenda      |\n"+
            "+------------------------------+\n"+
            "|  1. Tenda Kecil: 250.000     |\n"+
            "|  2. Tenda Sedang: 500.000    |\n"+
            "|  3. Tenda Besar: 1.000.000   |\n"+
            "+------------------------------+\n"
        );

        try(Scanner Input = new Scanner(System.in)){
            while(angka != 1){
                System.out.print("Input jenis tenda [1 - 3] : ");
                InputJenis = Input.nextInt();
                if(InputJenis >= 1 && InputJenis <= 3){
                    angka = 1;
                }
                else{
                    ErrorMassage();
                }
            }
            angka = 0;

            while (angka != 1) {
                System.out.print("Input hari peminjaman tenda : ");
                InputHari = Input.nextInt();
                if(InputHari <= 0){
                    ErrorMassage();
                    continue;
                }
                angka = 1;
            }

            TotalHarga = SewaTenda.Sewa(InputHari, InputJenis);
            System.out.print("Total Biaya Peminjaman Tenda : "+TotalHarga);
        }
    }    
}