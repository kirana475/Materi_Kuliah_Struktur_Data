public class Kelas {
    siswa pertama;
    siswa terakhir;

    public Kelas(siswa x) {
        pertama = x;
        terakhir = x;
    }

    public siswa ambilDi(Integer index) {
        if (index < 0) return null;
        siswa sekarang = pertama;
        int hitung = 0;
        while (sekarang != null && hitung < index) {
            sekarang = sekarang.berikutnya;
            hitung++;
        }
        return (sekarang == null) ? null : sekarang;
    }

    public Integer urutan(String nama) {
        siswa sekarang = pertama;
        int urutan = 0;

        while (sekarang != null) {
            if (sekarang.nama.equalsIgnoreCase(nama)) return urutan;
            sekarang = sekarang.berikutnya;
            urutan++;
        }
        return null;
    }

    public Integer jumlahsiswa() {
        siswa sekarang = pertama;
        int jumlah = 0;

        while (sekarang != null) {
            jumlah++;
            sekarang = sekarang.berikutnya;
        }
        return jumlah;
    }

    public void tambahDiDepan(siswa s) {
        s.berikutnya = pertama;
        pertama = s;
        if (terakhir == null) terakhir = pertama;
    }

    public void tambahSetelah(String nama, siswa s) {
        siswa sekarang = pertama;

        while (sekarang != null) {
            if (sekarang.nama.equalsIgnoreCase(nama)) {
                s.berikutnya = sekarang.berikutnya;
                sekarang.berikutnya = s;
                if (sekarang == terakhir) {
                    terakhir = s; // Update terakhir jika ditambahkan di akhir
                }
                return;
            }
            sekarang = sekarang.berikutnya;
        }
    }

    public void hapus(String nama) {
        if (pertama == null) return;
        if (pertama.nama.equalsIgnoreCase(nama)) {
            pertama = pertama.berikutnya;
            if (pertama == null) terakhir = null;
            return;
        }
        siswa sekarang = pertama;
        siswa sebelumnya = null;
        while (sekarang != null && !sekarang.nama.equalsIgnoreCase(nama)) {
            sebelumnya = sekarang;
            sekarang = sekarang.berikutnya;
        }
        if (sekarang != null) {
            sebelumnya.berikutnya = sekarang.berikutnya;
            if (sekarang == terakhir) terakhir = sebelumnya;
        }
    }

    public void tambahDiBelakang(siswa s) {
        if (terakhir == null) {
            pertama = s;
        } else {
            terakhir.berikutnya = s;
        }
        terakhir = s;
    }

    public void tampilkansemua() {
        System.out.println("Daftar siswa:");
        siswa sekarang = pertama;
        while (sekarang != null) {
            System.out.println(sekarang.nama);
            sekarang = sekarang.berikutnya;
        }
        System.out.println();
    }
}

