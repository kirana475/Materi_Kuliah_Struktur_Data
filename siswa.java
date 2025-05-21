public class siswa {
    String nama;
    siswa berikutnya;

    public siswa(String nama) {
        this.nama = nama;
        this.berikutnya = null;
    }

    public siswa() {
        this.berikutnya = null;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public siswa getBerikutnya() {
        return berikutnya;
    }

    public void setBerikutnya(siswa berikutnya) {
        this.berikutnya = berikutnya;
    }

    @Override
    public String toString() {
        return "siswa{nama='" + nama + "'}";
    }
}
