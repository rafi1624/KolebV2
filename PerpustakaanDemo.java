package KolebV2;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        
            Perpustakaan data = new Perpustakaan();
    
            data.tambah(new Buku("B001", "Algoritma", "Joko", 2018));
            data.tambah(new Buku("B002", "Struktur Data", "Budi", 2020));
            data.tambah(new Buku("B003", "Java OOP", "Sari", 2021));
            data.tambah(new Buku("B004", "Pemrograman Web", "Rina", 2019));
            data.tambah(new Buku("B005", "Struktur Data", "Ali", 2017));
    
            System.out.println("=== DATA BUKU ===");
            data.tampil();
    
    }
    
}
