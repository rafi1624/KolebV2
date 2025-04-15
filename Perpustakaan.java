package KolebV2;

public class Perpustakaan {
    Buku[] listBuku = new Buku[10];
    int idx = 0;

    void tambah(Buku b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listBuku[i].tampilInformasi();
        }
    }

    int sequentialSearchJudul(String cariJudul) {
        for (int i = 0; i < idx; i++) {
            if (listBuku[i].judul.equalsIgnoreCase(cariJudul)) {
                return i;
            }
        }
        return -1;
    }

    

    
}
