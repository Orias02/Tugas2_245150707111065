public class Pegawai {
//class
    String nama;
    String jabatan;
    Double gajiPokok;
    Double tunjangan;
    Double potongan = 0.0;
    Double bonus = 0.0;
//variable statis
    static int idPegawaiBase = 0;
//id pegawai yg dihasilkan dari input pegawaiBase
    int idPegawai;

//konstruktor tanpa parameter
    protected Pegawai() //dipanggil jika tanpa parameter
    {
        nama = "";
        jabatan = "";
        gajiPokok = 0.0;
        tunjangan = 0.0;
        potongan = 0.0;
        bonus = 0.0;
    }

    //konstruktor dengan parameter
    protected Pegawai(String _nama, String _jabatan, Double _gajiPokok, Double _tunjangan)
    // dipanggil jika objek Pegawai dibuat dengan informasi tertentu
    {
        idPegawaiBase++;
        idPegawai = idPegawaiBase;
        
        nama = _nama;
        jabatan = _jabatan;
        gajiPokok = _gajiPokok;
        tunjangan = _tunjangan;
    }

    protected void tambahBonus(double _bonus)
    {
        bonus = _bonus;
        //metode ini akan menetapkan nilai bonus pegawai dengan _bonus yang diberikan sebagai parameter.
    }

    protected void tambahPotongan(double _potongan)
    {
        potongan = _potongan;
    }

    protected double hitungGajiTotal()
    {
        Double gajiTotal;
        gajiTotal = gajiPokok + tunjangan + bonus - potongan;
        return gajiTotal;
    }

    protected void displayInfo()
    {
        System.out.println
        (
            "Nama       : " +  nama + "\n"+
            "ID Pegawai : " + idPegawai + "\n"+
            "Jabatan    : " +  jabatan + "\n"+
            "Gaji Pokok : " +  gajiPokok + "\n"+
            "Tunjangan  : " +  tunjangan + "\n"+
            "Bonus      : " +  bonus + "\n"+
            "Potongan   : " +  potongan + "\n"+
            "======================================\n\n"+
            "Gaji total : " +  String.format("%,.2f", hitungGajiTotal())+ "\n"+
            "======================================\n\n"
        );
    }


}