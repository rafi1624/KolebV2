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
    
                      // Sequential Search (Judul)
                System.out.println("=== PENCARIAN JUDUL (Sequential Search) ===");
                String cariJudul = "Struktur Data";
                int pos1 = data.sequentialSearchJudul(cariJudul);
                data.tampilPosisi(cariJudul, pos1);
                data.tampilDataSearch(cariJudul, pos1);
        
                // Binary Search (Tahun Terbit)
                System.out.println("=== PENCARIAN TAHUN TERBIT (Binary Search) ===");
        
                // *Pastikan data sudah terurut berdasarkan tahun sebelum pencarian binary!*
                // Untuk percobaan ini, anggap data sudah dimasukkan dalam urutan
        
                int cariTahun = 2019;
                int pos2 = data.binarySearchTahun(cariTahun);
                data.tampilPosisi(cariTahun, pos2);
                data.tampilDataSearch(cariTahun, pos2);
        
    }
    
  
}

