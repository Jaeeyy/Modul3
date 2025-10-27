package SystemNota;

public class FoodOrderReceipt {
    String customerName;
    ItemMakanan MenuItem;
    int jumlah;
    final double TAX_RATE = 0.1; // Pajak 10%

    // Konstruktor
    public FoodOrderReceipt(String customerName, ItemMakanan menuitem, int jumlah) {
        this.customerName = customerName;
        this.MenuItem= menuitem;
        this.jumlah = jumlah;
    }


    // Method untuk menghitung total harga
    double calculateTotal() {
        double subtotal = TotalJumlah();
        double tax = subtotal * TAX_RATE;
        return PenghitunganPajak(subtotal, tax);
    }

    private double TotalJumlah() {
        return jumlah * MenuItem.pricePerItem;
    }

    private static double PenghitunganPajak(double subtotal, double tax) {
        return subtotal + tax;
    }

    // Method untuk menampilkan struk
    void printReceipt() {
        System.out.println("\n====== RESTORAN MBUDSPID ======");
        System.out.println("Nama Pelanggan : " + customerName);
        System.out.println("Menu Dipesan   : " + MenuItem.name);
        System.out.println("Jumlah Pesanan : " + jumlah);
        System.out.println("Harga per Item : Rp" + MenuItem.pricePerItem);
        System.out.println("--------------------------------");
        System.out.println("Total Bayar (termasuk pajak): Rp" + calculateTotal());
        System.out.println("====== TERIMA KASIH ======\n");
    }
}
