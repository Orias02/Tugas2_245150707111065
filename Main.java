import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);
        int totalPegawai;

       // Variabel ini Menyimpan data sementara sebelum dimasukkan ke dalam objek Pegawai.
        String namaM;
        String jabatanM;
        Double gajiPokokM;
        Double tunjanganM;

        System.out.print("Masukan banyak pegawai: ");
        totalPegawai = fa.nextInt();
        fa.nextLine();
        
        //Array karyawan dibuat untuk menyimpan objek pegawai sebanyak totalPegawai.
        Pegawai[] karyawan = new Pegawai[totalPegawai];

        for (int i = 0; i < totalPegawai; i++) //looping
        {
            System.out.println("Masukan data karyawan ke-" + (i+1) + ": \n");
            System.out.print("Nama pegawai: ");
            namaM = fa.nextLine();
            System.out.print("Jabatan     : ");
            jabatanM = fa.nextLine();
            System.out.print("Gaji Pokok  : ");
            gajiPokokM = fa.nextDouble();
            System.out.print("Tunjangan   : ");
            tunjanganM = fa.nextDouble();
            fa.nextLine();

            karyawan[i] = new Pegawai (namaM, jabatanM, gajiPokokM, tunjanganM);
//Setiap kali input data, program akan membuat objek Pegawai baru dengan data tersebut, lalu menyimpannya ke dalam array
            Double potonganM = 0.0;
            Double bonusM = 0.0;

            System.out.println("\nApakah anda ingin menambah bonus dan potongan?");
            System.out.println("1. Ya\n2. Tidak\nPilihan anda: ");
            short pilihan;
            pilihan = fa.nextShort();
            fa.nextLine();

            switch (pilihan)
            {
                case 1:
                System.out.print("\nBonus   : ");
                bonusM = fa.nextDouble();
                System.out.print("\nPotongan: ");
                potonganM = fa.nextDouble();
                fa.nextLine();

                karyawan[i].tambahBonus(bonusM);
                karyawan[i].tambahPotongan(potonganM);

                
                break;
                case 2:
                System.out.println("Bonus dan potongan default: 0");
                break;
                default:
                System.out.println("Pilihan diluar menu, tidak ada");
                break;
            }

        }

        System.out.println("\n======== DATA SELURURUH PEGAWAI ========");
        for (int i = 0; i < totalPegawai; i++)
        {
            karyawan[i].displayInfo();
            System.out.println("");
        }

        fa.close();
    }
}