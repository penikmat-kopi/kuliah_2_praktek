// Programmer : Adam Rahmat Ilahi
// Tuesday, 24 May 2022
//
//

#include <iostream>

int main(void){
    int InputJenis, InputHari, TotalHarga;

    std::cout << "+---------------------------------------------------------+" <<
    std::endl << "|        Program persewaan Tenda untuk 1 hari             |" <<
    std::endl << "|                                                         |" <<
    std::endl << "|     1. Tenda kecil                  : 250.000           |" << 
    std::endl << "|     2. Tenda kapasitas 150 orang    : 500.000           |" <<
    std::endl << "|     3. Tenda Besar 500 orang        : 1.000.000         |" <<
    std::endl << "+---------------------------------------------------------+" <<
    std::endl;

    for(;;){
        std::cout << "Input jenis tenda [1 - 3]     : ";
        std::cin >> InputJenis;
        if(InputJenis >= 1 && InputJenis <= 3){
            break;// keluar dari loop
        }
        else{
            std::cout << "terjadi kesalahan input" << std::endl;
        }
    }

    for(;;){
        std::cout << "Input hari peminjaman tenda   : ";
        std::cin >> InputHari;
        if(InputHari <= 0 ){
            std::cout << "hari tidak boleh lebih kecil atau sama dengan 0" << std::endl;
            continue;
        }
        break; // keluar dari loop
    }

    // proses
    if(InputJenis == 1){
        TotalHarga = InputHari * 250000;
    }
    if(InputJenis == 2){
        TotalHarga = InputHari * 500000;
    }
    if(InputJenis == 3){
        TotalHarga = InputHari * 1000000;
    }

    std::cout << "Total Biaya Peminjaman Tenda : " << TotalHarga;
    
}