public class DemoKelas {
    public static void main(String[] args) {
        siswa Prameswari = new siswa("Prameswari");

        Kelas k = new Kelas(Prameswari);

        k.tambahDiBelakang(new siswa("Aswandy"));
        k.tambahDiBelakang(new siswa("Jingga"));
        k.tambahDiBelakang(new siswa("Ubi"));
        k.tambahDiBelakang(new siswa("Kirana"));
        k.tampilkansemua();

        // Menghapus 2 siswa: "Aswandy" dan "Jingga"
        k.hapus("Aswandy");
        k.hapus("Jingga");
        k.tampilkansemua();

        // Menambah 3 siswa baru
        k.tambahDiBelakang(new siswa("Aisyah"));
        k.tambahDiBelakang(new siswa("Fitri"));
        k.tambahDiBelakang(new siswa("Destri"));
        k.tampilkansemua();

        System.out.println("Jumlah siswa: " + k.jumlahsiswa());
        System.out.println("Urutan Ubi: " + k.urutan("Ubi"));
        System.out.println("Siswa di index 2: " + k.ambilDi(2).nama);
    }
}
