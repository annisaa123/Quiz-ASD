/**
 * Barang04
 */
public class Barang04 {
    String  kode;
    String nama;
    int harga;
    int stok;

    public Barang04(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public void tampilkanBarang04() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
