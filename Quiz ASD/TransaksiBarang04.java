/**
 * TransaksiBarang04
 */
public class TransaksiBarang04 {

    private Barang04[] barang04s;
    private int[] jumlahBarang04;

    public TransaksiBarang04(Barang04[] barang04s){
        this.barang04s = barang04s;
        jumlahBarang04 = barang04s.length;
    }

    public void tampilkanBarang{
        System.out.println("Daftar Barang: ");
        System.out.println("==========================");
        for (Barang04 barang04 : barang04s) {
            System.out.println(barang04);
        }
    }
    public void lakukanPembelian(String kodeBarang04) {
        for (Barang04 barang04 : barang04s) {
            if (barang04.getKode().equals(kodeBarang04)) {
                if (barang04.getStok() > 0){
                    barang04.setStok(barang04.getStok() -1 );
                    System.out.println("Pembelian " + barang04.getNama() + " berhasil!");
                } else {
                    System.out.println("Stok: " + barang.getNama() + "habis!");

                }
                break;
            }
        }
    }
}