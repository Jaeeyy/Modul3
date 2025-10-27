package SystemNota;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan nama pelanggan: ");
            String customerName = input.nextLine();


            System.out.print("Masukkan nama makanan: ");
            String foodName = input.nextLine();

            System.out.print("Masukkan harga per item: Rp");
            double price = input.nextDouble();

            System.out.print("Masukkan jumlah pesanan: ");
            int quantity = input.nextInt();

            // Membuat objek
            ItemMakanan item = new ItemMakanan(foodName, price);
            FoodOrderReceipt order = new FoodOrderReceipt(customerName, item, quantity);

            // Menampilkan struk
            order.printReceipt();

            input.close();
        }
}
