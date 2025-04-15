package KolebV2;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        
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

