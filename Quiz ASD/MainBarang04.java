/**
 * MainBarang04
 */
public class MainBarang04 {

    public static void main(String[] args) {
        Barang04[] barang04s = {
            new Barang04("BRGO1", "Sabun", 5000,10),
            new Barang04("BRGO2", "Shampoo", 10000,20),
            new Barang04("BRGO3", "Pasta Gigi", 7500,15),
            new Barang04("BRGO4", "Sikat Gigi", 3000,25),
            new Barang04("BRGO5", "Deterjen", 20000,30),
        };
        TransaksiBarang04 transaksiBarang04 = new transaksiBarang04(barang04s);
        
        int pilihan;
        do{
            System.out.println("TOKO MAJU MUNDUR CANTIK: ");
            System.out.println("=======================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Tampilkan Barang Pembelian");
            System.out.println("3. Lakukan Pembelian");
            System.out.println("4. Keluar");
            System.out.println("Pilihan Anda: ");
            pilihan = Int.parseInt(System.console().readLine());

            switch (pilihan) {
                case 1:
                transaksiBarang04.tampilkanBarang04();
                    break;
                    
                    case 2:
                    transaksiBarang04.tampilkanBarang04Pembelian();
                    break;
                    
                    case 3:
                    System.out.print("Masukkan Kode Barang");
                    String kodeBarang04 = System.console().readLine();
                    transaksiBarang04.lakukanPembelian(kodeBarang04);
                    break;
                    
                        default:
                            break;
            }
        }while (pilihan != 4 );
    }
}