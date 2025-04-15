package KolebV2;

public class Buku {
   
        String kodeBuku, judul, penulis;
        int tahunTerbit;
    
        public Buku(String kode, String judul, String penulis, int tahun) {
            this.kodeBuku = kode;
            this.judul = judul;
            this.penulis = penulis;
            this.tahunTerbit = tahun;
        }
    
        public void tampilInformasi() {
            System.out.println("Kode Buku: " + kodeBuku);
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunTerbit);
            System.out.println("------------------------");
        }
    }
    
    
