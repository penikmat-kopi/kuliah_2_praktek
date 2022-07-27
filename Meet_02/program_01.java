package Meet_02; // hapus baris program ini jika error di kompiler mu
import java.util.Scanner;

public  class program_01
{
    static void DumpMethod(){
        // methode ini gk pernah di panggil, kenapa ? tanya akbar.
        
    }

    static void Menu(){
        System.out.print(
            "+------------------------------+\n"+
            "|      Program sewa Tenda      |\n"+
            "+------------------------------+\n"+
            "|  1. Tenda Kecil: 250.000     |\n"+
            "|  2. Tenda Sedang: 500.000    |\n"+
            "|  3. Tenda Besar: 1.000.000   |\n"+
            "+------------------------------+\n"
        );
    }

    static int Total(int a, int b){
        return a * b;
    }

    static void ErrorMsg(){
        System.out.print(
            "terjadi kesalahan input\n\n"
        );
    }

    public static void main(String[] args){
        try(Scanner Input = new Scanner(System.in)){
            int InputJenis = 0, InputHari = 0, TotalHarga = 0, angka = 0;

            Menu();   
            while (angka != 1) {
                System.out.print("Input jenis tenda [1 - 3] : ");
                InputJenis = Input.nextInt();
                if(InputJenis >= 1 && InputJenis <= 3){
                    angka = 1;
                }
                else{
                    ErrorMsg();
                }
            }
            angka = 0;

            while (angka != 1) {
                System.out.print("Input hari peminjaman tenda : ");
                InputHari = Input.nextInt();
                if(InputHari <= 0){
                    ErrorMsg();
                    continue;
                }
                angka = 1;
            }

            if(InputJenis == 1){
                TotalHarga = Total(InputHari,250000);
            }
            if(InputJenis == 2){
                TotalHarga = Total(InputHari,500000);
            }
            if(InputJenis == 3){
                TotalHarga = Total(InputHari,1000000);
            }

            System.out.print("Total Biaya Peminjaman Tenda : "+TotalHarga);
        }
    }
}