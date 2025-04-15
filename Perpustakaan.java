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

    int binarySearchTahun(int cariTahun) {
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (listBuku[mid].tahunTerbit == cariTahun) {
                return mid;
            } else if (cariTahun < listBuku[mid].tahunTerbit) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    void tampilPosisi(String data, int pos) {
        if (pos != -1) {
            System.out.println("Data \"" + data + "\" ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data \"" + data + "\" tidak ditemukan.");
        }
    }

    void tampilPosisi(int data, int pos) {
        if (pos != -1) {
            System.out.println("Tahun \"" + data + "\" ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Tahun \"" + data + "\" tidak ditemukan.");
        }
    }

    void tampilDataSearch(String data, int pos) {
        if (pos != -1) {
            listBuku[pos].tampilInformasi();
        }
    }

    void tampilDataSearch(int data, int pos) {
        if (pos != -1) {
            listBuku[pos].tampilInformasi();
        }
    }
}
    

    

